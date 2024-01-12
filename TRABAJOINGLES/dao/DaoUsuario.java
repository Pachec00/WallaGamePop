package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Usuario;

public class DaoUsuario implements DaoUsuarioInterface {

	@Override
	public Usuario consultarUsuario(String usuario, Connection conn) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Usuario us = new Usuario();
		try {

			String sql = "SELECT * FROM USUARIO WHERE USUARIO=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, usuario);
			rs = stmt.executeQuery();
			if (rs.next()) {
				us.setUsuario(usuario);
				us.setApellido(rs.getString("apellido"));
				us.setContraseña(rs.getString("contraseña"));
				us.setIdUsuario(rs.getInt("id_usuario"));
				us.setNombre(rs.getString("nombre"));			
				return us;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException();
		}

		finally {

			try {
				stmt.close();
			} catch (Exception e) {

			}

		}

		return null;
	
	}

	@Override
	public Boolean insertarUsuario(Usuario usuario, Connection conn) throws SQLException {
		PreparedStatement stmt = null;
		Usuario us= new Usuario();
		try {
			us=consultarUsuario(usuario.getUsuario(), conn);
			if(us.getIdUsuario()==null) {
				String sql = "INSERT INTO USUARIOS (NOMBRE,APELLIDO,USUARIO,CONTRASEÑA) values (?,?,?,?)";
				stmt = conn.prepareStatement(sql);
				stmt.setString(1, usuario.getNombre());
				stmt.setString(2, usuario.getApellido());
				stmt.setString(3, usuario.getUsuario());
				stmt.setString(4, usuario.getContraseña());
				stmt.execute();
				return true;
			}
		} catch (Exception e) {
			throw new SQLException();
		} finally {

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {

				}
			}

		}
		return false;
	}

}
