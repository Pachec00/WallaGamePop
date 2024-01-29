package src.app.gui.iniciarSesion;



import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class iniciarSesionController extends AppController {



	@FXML
	private TextField tfUsuario;
	@FXML
	private PasswordField tfContra;

	@FXML
	public void entrar() {
		
		if(tfUsuario!=null && tfContra!=null) {
			usuario = usuSer.login(tfUsuario.getText(), tfContra.getText());
			if (usuario != null) {
				//add(AppShopController.e);
				cambiarVista(FXMLPaths.PANTALLA_2);
			} else {
				Alert a = new Alert(AlertType.ERROR);
				a.setHeaderText(null);
				a.setContentText("Error en el usuario o contraseña");
				a.setTitle("Error");
				a.showAndWait();
			}
		}else {
			Alert a = new Alert(AlertType.ERROR);
			a.setHeaderText(null);
			a.setContentText("Error en el usuario o contraseña");
			a.setTitle("Error");
			a.showAndWait();
		}
		

	}

	@FXML
	public void home() {

		cambiarVista(FXMLPaths.PANTALLA_2);

	}
}
