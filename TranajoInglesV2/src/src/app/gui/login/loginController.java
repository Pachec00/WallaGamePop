package src.app.gui.login;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class loginController extends AppController {

	@FXML
	private Button boton;

	@FXML
	public void entrar() {

		cambiarVista(FXMLPaths.PANTALLA_2);

	}
}
