package service;

import modelo.Usuario;

public interface UsuarioServiceInterface {

	public Boolean login(String usuario, String contraseña);
	
	public Boolean registrar(Usuario usuario);
}
