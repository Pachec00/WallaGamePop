package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import bd.OpenConnection;
import dao.DaoProducto;
import exceptions.ListaVaciaException;
import modelo.Producto;
import modelo.Usuario;

public class ProductoService implements ProductoServiceInterface {

	private OpenConnection openConnection;

	public ProductoService() {
		openConnection = new OpenConnection();
	}

	@Override
	public List<Producto> consultarListaProductoService(Usuario us) throws SQLException, ListaVaciaException {
		Connection conn = null;

		try {

			conn = openConnection.getConnection();
			DaoProducto dao = new DaoProducto();

			List<Producto> listaProducto = dao.consultaListaProductos(us, conn);
			if (listaProducto.isEmpty()) {
				throw new ListaVaciaException("Error, la lista consultada está vacía");
				// lanzar excepcion para indicar lista vacia
			}

			return listaProducto;
		} catch (SQLException e) {
			throw new SQLException("Error en la BBDD", e);
		}

	}

	@Override
	public void insertarProductoService(Producto prod) throws SQLException {
		Connection conn = null;

		try {
			conn = openConnection.getConnection();
			DaoProducto dao = new DaoProducto();

			dao.insertarProducto(prod, conn);
		} catch (SQLException e) {
			throw new SQLException("Error en la BBDD", e);
		}

	}
	
	
	
	

}
