package service;

import modelo.Usuario;

public interface UsuarioServiceInterface {

	public void login(String usuario, String contraseña);
	
	public void registrar(Usuario usuario);
}
