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
	// Colores
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";

	// TODO Test para services

	public static void main(String[] args) {
		Usuario userExiste = new Usuario();
		Usuario userNoExiste = new Usuario();
		Producto producto = new Producto();

		// Crear objetos para los tests

		userExiste.setUsuario("admin");
		userExiste.setContraseña("123");

		userNoExiste.setUsuario("admin2");
		userNoExiste.setContraseña("123");

		usuarioRegistrarTest(userNoExiste);

		usuarioLoginTest(userExiste, userNoExiste);
		
		productoTest(userExiste, userNoExiste);

	}

	public static void usuarioLoginTest(Usuario userExiste, Usuario userNoExiste) {
		UsuarioService us = new UsuarioService();
		Usuario r;

		System.out.println("TEST PARA LOGIN");
		/*
		 * Test funcion login() Probar tanto un usuario que exista como uno que no
		 * Existe devuelve TRUE No existe devuelve FALSE
		 */

		// Test para Usuario NO existe

		r = us.login(userNoExiste.getUsuario(), userNoExiste.getContraseña());

		if (r == null) {
			System.out.println(ANSI_GREEN + "...Test pasado" + ANSI_RESET);
		} else {
			System.err.println("...Test No pasado");
		}

		// Test para Usuario SI existe

		r = us.login(userExiste.getUsuario(), userExiste.getContraseña());

		if (r.getUsuario().equals(userExiste.getUsuario()) && r.getContraseña().equals(userExiste.getContraseña())) {
			System.out.println(ANSI_GREEN + "...Test pasado" + ANSI_RESET);
		} else {
			System.err.println("...Test NO pasado");
		}

	}

	public static void usuarioRegistrarTest(Usuario userNoExiste) {
		UsuarioService us = new UsuarioService();
		Boolean r;

		/*
		 * Test funcion registrar
		 */

		System.out.println("TEST PARA REGISTRAR USUARIO");
		try {
			r = us.registrar(userNoExiste);
			if (r == true) {
				System.out.println(ANSI_GREEN + "...Test pasado" + ANSI_RESET);
			} else {
				System.err.println("...Test NO pasado");
			}
		} catch (NoSuchAlgorithmException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void productoTest(Usuario userExiste, Usuario userNoExiste) {
		ProductoService ps = new ProductoService();
		List<Producto> lista = new ArrayList<>();

		
		System.out.println("TEST PARA PRODUCTO");
		
		// Test para consultarListaProducto
		// Si la lista esta vacia puede ser pq no exista o por un error

		// Usuario que existe
		
		System.out.println("TEST PARA USUARIO QUE EXISTE");

		try {
			lista = ps.consultarListaProductoService(userExiste);
			
			if (!lista.isEmpty()) {
				System.out.println(ANSI_GREEN + "...Test pasado" + ANSI_RESET);
			} else {
				System.err.println("...Test NO pasado");
			}
		} catch (SQLException | ListaVaciaException e) {
			e.printStackTrace();
		}

		

		// Usuario que NO existe

		System.out.println("TEST PARA USUARIO QUE NO EXISTE");
		
		try {
			lista = ps.consultarListaProductoService(userNoExiste);
			
			if (lista.isEmpty()) {
				System.out.println(ANSI_GREEN + "...Test pasado" + ANSI_RESET);
			} else {
				System.err.println("...Test NO pasado");
			}
		} catch (SQLException | ListaVaciaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		

	}

}
