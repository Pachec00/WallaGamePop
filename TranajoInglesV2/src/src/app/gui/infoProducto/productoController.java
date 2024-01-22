package src.app.gui.infoProducto;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class productoController extends AppController {

	@FXML
	private Button boton;

	@FXML
	public void home() {

		cambiarVista(FXMLPaths.PANTALLA_2);
		
	}
	
	
	
	@FXML
	public void carrito() {

		cambiarVista(FXMLPaths.CARRITO);

	}
	
	
	@FXML
	public void add() {

		cambiarVista(FXMLPaths.PANTALLA_2);

	}
}
