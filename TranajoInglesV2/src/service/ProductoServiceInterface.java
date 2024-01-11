package service;

import java.sql.Connection;
import java.util.List;

import modelo.Producto;
import modelo.Usuario;

public interface ProductoServiceInterface {

	public List<Producto> consultarListaProductoService(Usuario us);
	
	public void insertarProductoService(Producto prod);
}
