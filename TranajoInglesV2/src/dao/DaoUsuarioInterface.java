package dao;

import java.sql.SQLException;

import org.mariadb.jdbc.Connection;

import modelo.Usuario;

public interface DaoUsuarioInterface {

	public Usuario login(String usuario, String contraseña, Connection conn ) throws SQLException;

	public Boolean registrar(Usuario usuario, Connection conn) throws SQLException;

}
