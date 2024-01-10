package dao;

import java.sql.Connection;
import java.sql.SQLException;



import modelo.Usuario;

public interface DaoUsuarioInterface {

	public Usuario consultarUsuario(String usuario, Connection conn ) throws SQLException;

	public Boolean insertarUsuario(Usuario usuario, Connection conn) throws SQLException;

}
