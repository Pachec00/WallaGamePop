package dao;

import modelo.Usuario;

public interface DaoUsuarioInterface {

	public Usuario login(String usuario, String contraseña);

	public Boolean registrar(Usuario usuario);

}
