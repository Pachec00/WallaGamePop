package src.app.gui.home;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class homeController extends AppController {

	@FXML
	private Button boton;

	@FXML
	public void entrarP1() {
		cambiarVista(FXMLPaths.PRO_1);
		
	}

	@FXML
	public void entrarP2() {

		cambiarVista(FXMLPaths.PRO_2);

	}

	@FXML
	public void entrarP3() {

		cambiarVista(FXMLPaths.PRO_3);

	}

	@FXML
	public void entrarP4() {

		cambiarVista(FXMLPaths.PRO_4);

	}

	@FXML
	public void entrarCarrito() {

		cambiarVista(FXMLPaths.CARRITO);

	}

}
