package Test;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exceptions.ListaVaciaException;
import modelo.Producto;
import modelo.Usuario;
import service.ProductoService;
import service.UsuarioService;

public class ServiceTest {

	// TODO Test para services

	public static void main(String[] args) {
		Usuario userExiste = new Usuario();
		Usuario userNoExiste = new Usuario();
		Producto producto = new Producto();

		// Crear objetos para los tests

	}

	public void usuarioTest(Usuario userExiste, Usuario userNoExiste) {
		UsuarioService us = new UsuarioService();
		Boolean r;

		/*
		 * Test funcion login() Probar tanto un usuario que exista como uno que no
		 * Existe devuelve TRUE No existe devuelve FALSE
		 */

		// Test para Usuario NO existe

		r = us.login(userNoExiste.getUsuario(), userNoExiste.getContraseña());

		if (r == false) {
			System.out.println("...Test pasado");
		} else {
			System.out.println("...Test NO pasado");
		}

		// Test para Usuario SI existe

		r = us.login(userExiste.getUsuario(), userExiste.getContraseña());

		if (r == true) {
			System.out.println("...Test pasado");
		} else {
			System.out.println("...Test NO pasado");
		}

		/*
		 * Test funcion registrar
		 */

		try {
			r = us.registrar(userNoExiste);
		} catch (NoSuchAlgorithmException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (r == true) {
			System.out.println("...Test pasado");
		} else {
			System.out.println("...Test NO pasado");
		}

	}

	public void productoTest(Producto prod, Usuario userExiste, Usuario userNoExiste) {
		ProductoService ps = new ProductoService();
		List<Producto> lista = new ArrayList<>();

		// Test para consultarListaProducto
		// Si la lista esta vacia puede ser pq no exista o por un error

		// Usuario que existe

		try {
			lista = ps.consultarListaProductoService(userExiste);
		} catch (SQLException | ListaVaciaException e) {
			e.printStackTrace();
		}

		if (!lista.isEmpty()) {
			System.out.println("...Test pasado");
		} else {
			System.out.println("...Test NO pasado");
		}

		// Usuario que NO existe

		try {
			lista = ps.consultarListaProductoService(userNoExiste);
		} catch (SQLException | ListaVaciaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (lista.isEmpty()) {
			System.out.println("...Test pasado");
		} else {
			System.out.println("...Test NO pasado");
		}

	}

}
