package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import modelo.Producto;
import modelo.Usuario;

public interface DaoProductoInterface {

	public List<Producto> consultaListaProductos(Usuario us, Connection conn) throws SQLException;
	
	
	public void insertarProducto(Producto prod, Connection conn) throws SQLException;
	
}
