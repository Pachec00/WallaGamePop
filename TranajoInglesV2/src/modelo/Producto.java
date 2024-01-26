package modelo;

import java.math.BigDecimal;
import java.util.Objects;

import lombok.Data;

@Data
public class Producto {

	private Integer idProducto;
	private String nombre;
	private BigDecimal precio;
	private String descripcion;
	private Integer idUsuario;
	private String imagen;

	public Producto(String nombre, String imagen, BigDecimal precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.imagen=imagen;
	}
	
	public Producto() {
		
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	
	
	
}
