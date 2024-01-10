package service;

import modelo.Usuario;

public interface UsuarioServiceInterface {

	public Boolean login(String usuario, String contraseña);
	
	public void registrar(Usuario usuario);
}
