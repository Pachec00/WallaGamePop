package src.app.gui.cesta;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class cestaController extends AppController {

	@FXML
	private Button boton;

	@FXML
	public void compra() {
		cambiarVista(FXMLPaths.PANTALLAINIREGI);

	}

	@FXML
	public void home() {
		cambiarVista(FXMLPaths.PANTALLA_2);

	}

}
