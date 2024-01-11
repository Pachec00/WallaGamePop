package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import modelo.Producto;
import modelo.Usuario;

public class DaoProducto implements DaoProductoInterface{

	@Override
	public List<Producto> consultaListaProductos(Usuario us, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarProducto(Producto prod, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
