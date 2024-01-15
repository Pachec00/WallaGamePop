package src.app.gui.compra;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class compraController extends AppController {

	@FXML
	private Button boton;

	@FXML
	public void aceptada() {
		cambiarVista(FXMLPaths.COMPRA);

	}

	@FXML
	public void home() {
		cambiarVista(FXMLPaths.PANTALLA_2);

	}

	@FXML
	public void cesta() {
		cambiarVista(FXMLPaths.CARRITO);

	}

}
