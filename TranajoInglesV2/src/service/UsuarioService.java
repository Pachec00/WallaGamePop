package service;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;

import bd.OpenConnection;
import dao.DaoUsuario;
import modelo.Usuario;

public class UsuarioService implements UsuarioServiceInterface {

	/*
	 * TODO Servicios de la interface TODO BLAS TODO FABIO
	 */

	// TODO Falta poner excepciones

	private OpenConnection openConnection;

	public UsuarioService() {
		openConnection = new OpenConnection();
	}

	@Override
	public Usuario login(String usuario, String contraseña) {
		Connection conn = null;

		try {
			String pass = encriptarPass(contraseña); // Añadir encriptacion

			conn = openConnection.getConnection();
			DaoUsuario dao = new DaoUsuario();

			Usuario usuarioCon = dao.consultarUsuario(usuario, conn);

			if (usuarioCon != null && usuarioCon.getContraseña().equals(pass)) {
				System.out.println(pass);
				System.out.println(usuarioCon.getContraseña());
				return usuarioCon;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) {

			}
		}
		return null;
	}

	@Override
	public Boolean registrar(Usuario usuario) throws NoSuchAlgorithmException, SQLException {
		Connection conn = null;
		Boolean r;

		try {
			String pass = encriptarPass(usuario.getContraseña());
			usuario.setContraseña(pass);
			conn = openConnection.getConnection();

			DaoUsuario dao = new DaoUsuario();
			r = dao.insertarUsuario(usuario, conn);
			
			return r;
		} catch (NoSuchAlgorithmException e1) {
			throw new NoSuchAlgorithmException("Error al encriptar", e1);
		} catch (SQLException e) {
			throw new SQLException("Error en la BBDD", e);
		}

	}

	// Siempre se pasa la pass encriptada con SHA2
	public String encriptarPass(String pass) throws NoSuchAlgorithmException {
		SHA2Hash e = new SHA2Hash();

		byte[] sha = e.getSHA(pass);

		String output = e.toHexString(sha);

		return output;

	}
}
