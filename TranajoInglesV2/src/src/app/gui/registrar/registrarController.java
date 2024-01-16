package src.app.gui.registrar;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class registrarController extends AppController {

	@FXML
	private Button boton;

	@FXML
	public void entrar() {

		cambiarVista(FXMLPaths.COMPRA);

	}
	
	
	@FXML
	public void home() {

		cambiarVista(FXMLPaths.PANTALLA_2);

	}
}
