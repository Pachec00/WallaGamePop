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

	// Falta poner excepciones

	private OpenConnection openConnection;

	public UsuarioService() {
		openConnection = new OpenConnection();
	}

	@Override
	public Boolean login(String usuario, String contraseña) {
		Connection conn = null;

		try {
			String pass = encriptarPass(contraseña);

			conn = openConnection.getConnection();
			DaoUsuario dao = new DaoUsuario();

			Usuario usuarioCon = dao.consultarUsuario(usuario, conn);

			if (usuarioCon != null && pass.equals(contraseña)) {
				return true;
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
		return false;
	}

	@Override
	public void registrar(Usuario usuario) {
		Connection conn = null;

		try {
			String pass = encriptarPass(usuario.getContraseña());
			conn = openConnection.getConnection();

			DaoUsuario dao = new DaoUsuario();
			dao.insertarUsuario(usuario, conn);
		} catch (NoSuchAlgorithmException e1) {

		} catch (SQLException e) {
			e.printStackTrace();
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
