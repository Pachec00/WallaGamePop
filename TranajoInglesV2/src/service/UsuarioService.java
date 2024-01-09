package service;

import java.security.NoSuchAlgorithmException;

public class UsuarioService {

	/*
	 * TODO Servicios de la interface
	 */

	//Siempre se pasa la pass encriptada con SHA2
	public String encriptarPass(String pass) throws NoSuchAlgorithmException {
		SHA2Hash e = new SHA2Hash();

		byte[] sha = e.getSHA(pass);

		String output = e.toHexString(sha);

		return output;

	}
}
