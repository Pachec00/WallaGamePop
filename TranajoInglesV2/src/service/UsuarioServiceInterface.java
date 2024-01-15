package service;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import modelo.Usuario;

public interface UsuarioServiceInterface {

	public Usuario login(String usuario, String contraseña);
	
	public Boolean registrar(Usuario usuario) throws NoSuchAlgorithmException, SQLException;
}
