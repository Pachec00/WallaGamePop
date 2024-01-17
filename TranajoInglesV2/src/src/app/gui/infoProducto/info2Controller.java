package src.app.gui.infoProducto;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import src.app.gui.AppController;
import src.app.gui.FXMLPaths;
import src.app.gui.cesta.cestaController;

public class info2Controller extends AppController {

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

	@FXML
	public void add() {
		cambiarVista(FXMLPaths.PANTALLA_2);
		FXMLLoader loader = new FXMLLoader(getClass().getResource(FXMLPaths.CARRITO));
		cestaController controller = loader.getController();

		controller.setNombre2("The last of Us");
		controller.setPrecio2("36 €");
		Image image = new Image("/app/gui/loginin/lastofUs.PNG");
		controller.setImage2(image);

	}
}
