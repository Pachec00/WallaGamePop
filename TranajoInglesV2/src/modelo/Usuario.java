package modelo;

import lombok.Data;

@Data
public class Usuario {

	private Integer idUsuario;
	private String nombre;
	private String apellido;
	private String usuario;
	private String contraseña;

}
