package src.app.gui.registrar;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import modelo.Usuario;
import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class registrarController extends AppController {

	@FXML
	private Button boton;
	@FXML
	private TextField tfNombre;
	@FXML
	private TextField tfUser;
	@FXML
	private PasswordField tfPass;

	@FXML
	public void entrar() {

		Boolean correcto = false;
		if (tfNombre != null && tfUser != null && tfPass != null) {
			Usuario us = new Usuario();
			us.setNombre(tfNombre.getText());
			us.setUsuario(tfUser.getText());
			us.setContraseña(tfPass.getText());
			try {
				correcto = usuSer.registrar(us);
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (correcto) {
				cambiarVista(FXMLPaths.INICIAR);
			} else {
				Alert a = new Alert(AlertType.ERROR);
				a.setHeaderText(null);
				a.setContentText("Usuario ya existe");
				a.setTitle("Error");
				a.showAndWait();
			}
		} else {
			Alert a = new Alert(AlertType.ERROR);
			a.setHeaderText(null);
			a.setContentText("Rellena los campos");
			a.setTitle("Error");
			a.showAndWait();
		}

	}

	@FXML
	public void home() {

		cambiarVista(FXMLPaths.PANTALLA_2);

	}
}
