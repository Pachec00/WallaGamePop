package src.app.gui.iniciarSesion;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class iniciarSesionController extends AppController {

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
