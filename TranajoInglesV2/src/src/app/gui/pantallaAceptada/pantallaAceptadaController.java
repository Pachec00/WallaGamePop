package src.app.gui.pantallaAceptada;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class pantallaAceptadaController extends AppController {

	@FXML
	private Button boton;

	@FXML
	public void home() {

		cambiarVista(FXMLPaths.PANTALLA_2);

	}
}
