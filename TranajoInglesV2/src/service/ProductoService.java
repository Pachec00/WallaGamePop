package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import bd.OpenConnection;
import dao.DaoProducto;
import modelo.Producto;
import modelo.Usuario;

public class ProductoService implements ProductoServiceInterface{

	private OpenConnection openConnection;
	
	public ProductoService() {
		openConnection = new OpenConnection();
	}
	
	@Override
	public List<Producto> consultarListaProductoService(Usuario us) {
		Connection conn = null;
		
		try {
			
			conn = openConnection.getConnection();
			DaoProducto dao = new DaoProducto();
			
			List<Producto> listaProducto = dao.consultaListaProductos(us, conn);
			return listaProducto;
		} catch (SQLException e) {
			
			return null; //Lanzar excepcion
		}
		
	}

	@Override
	public void insertarProductoService(Producto prod) {
		Connection conn = null;
		
		try {
			conn = openConnection.getConnection();
			DaoProducto dao = new DaoProducto();
			
			dao.insertarProducto(prod, conn);
		} catch (SQLException e) {
			//Lanzar excepcion
			e.printStackTrace();
		}
		
	}

}
