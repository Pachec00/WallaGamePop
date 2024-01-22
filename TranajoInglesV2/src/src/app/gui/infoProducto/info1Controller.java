package src.app.gui.infoProducto;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class info1Controller extends AppController {

	@FXML
	private Button boton;

	@FXML
	private Label contador;

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
