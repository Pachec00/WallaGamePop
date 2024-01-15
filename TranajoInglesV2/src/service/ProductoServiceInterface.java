package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import exceptions.ListaVaciaException;
import modelo.Producto;
import modelo.Usuario;

public interface ProductoServiceInterface {

	public List<Producto> consultarListaProductoService(Usuario us) throws SQLException, ListaVaciaException;
	
	public void insertarProductoService(Producto prod) throws SQLException;
}
