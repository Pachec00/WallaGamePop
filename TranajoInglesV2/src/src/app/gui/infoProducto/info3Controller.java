package src.app.gui.infoProducto;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import src.app.gui.AppShopController;
import src.app.gui.FXMLPaths;

public class info3Controller extends AppShopController {

	@FXML
	private Button boton;

	@FXML
	public void home() {

		cambiarVista(FXMLPaths.PANTALLA_2);

	}

	@FXML
	public void carrito() {

		cambiarVista(FXMLPaths.CARRITO);

	}


}
