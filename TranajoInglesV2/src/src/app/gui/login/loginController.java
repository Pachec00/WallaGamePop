package src.app.gui.login;


import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.layout.AnchorPane;

import src.app.gui.AppController;
import src.app.gui.FXMLPaths;


public class loginController extends AppController {
	@FXML
	private AnchorPane pane;


	@FXML
	private Button boton;
	
	
	
	@FXML
	public void entrar() {
		AppController controller = new AppController(primaryStage);
		controller.cambiarVista(FXMLPaths.PANTALLA_2);

	}
}
