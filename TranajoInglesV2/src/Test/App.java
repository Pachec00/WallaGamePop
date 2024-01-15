package Test;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import modelo.Usuario;
import service.UsuarioService;

public class App {

	// Declaring ANSI_RESET so that we can reset the color 
    public static final String ANSI_RESET = "\u001B[0m"; 
  
    // Declaring the color 
    // Custom declaration 
    public static final String ANSI_GREEN = "\u001B[32m"; 
  
    // Main driver method 
    public static void main(String[] args) 
    { 
        // Printing the text on console prior adding 
        // the desired color 
        System.out.println(ANSI_GREEN 
                           + "This text is yellow"
                           + ANSI_RESET); 
    }
}
