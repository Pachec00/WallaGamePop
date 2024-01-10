package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Statement;

import modelo.Usuario;

public class DaoUsuario implements DaoUsuarioInterface {

	@Override
	public Usuario login(String usuario, String contraseña, Connection conn) {
//		PreparedStatement stmt = null;
//		Usuario us= new Usuario();
//		try {
//			String sql = "INSERT INTO USUARIOS (NOMBRE,APELLIDO,USUARIO,CONTRASEÑA) values (?,?,?,?)";
//			stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//			stmt.setString(1, );
//			
//			
//			
//			stmt.execute();
//
//		} catch (Exception e) {
//			throw new SQLException();
//		} finally {
//
//			if (stmt != null) {
//				try {
//					stmt.close();
//				} catch (SQLException e1) {
//
//				}
//			}
//		
//		
//		
//		return us;
	return null;
	
		
	}

	@Override
	public Boolean registrar(Usuario usuario, Connection conn) {
		PreparedStatement stmt = null;
		
		try {
			String sql = "INSERT INTO USUARIOS (NOMBRE,APELLIDO,USUARIO,CONTRASEÑA) values (?,?,?,?)";
			stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, usuario.getNombre());
			stmt.setString(2, usuario.getApellido());
			stmt.setString(3, usuario.getUsuario());
			stmt.setString(4, usuario.getContraseña());
			
			
			
			stmt.execute();

		} catch (Exception e) {
			throw new SQLException();
		} finally {

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {

				}
			}
		
		
		
		return false;
		
	
	}

	}

}
