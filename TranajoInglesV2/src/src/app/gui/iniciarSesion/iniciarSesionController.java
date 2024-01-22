package src.app.gui.iniciarSesion;

import java.awt.TextField;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class iniciarSesionController extends AppController {

	@FXML
	private Button boton;
	
	@FXML
	private TextField tfUsuario;
	@FXML
	private TextField tfContra;
	
	
	@FXML
	public void entrar() {

		cambiarVista(FXMLPaths.COMPRA);
		usuario=usuSer.login(tfUsuario.getText(), tfContra.getText());
		
		
		
	}
	
	@FXML
	public void home() {

		cambiarVista(FXMLPaths.PANTALLA_2);

	}
}
