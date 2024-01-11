package modelo;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Producto {

	private Integer idProducto;
	private String nombre;
	private BigDecimal precio;
	private String descripcion;
	
	
	
}
