package src.app.gui.infoProducto;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import src.app.gui.AppController;
import src.app.gui.FXMLPaths;
import src.app.gui.cesta.cestaController;

public class info1Controller extends AppController {

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

	cestaController controller =	(cestaController) cambiarVista(FXMLPaths.PANTALLA_2);
	
	controller.setNombre1("Starfield");
	controller.setPrecio1("40 €");
	Image image = new Image("/app/gui/loginin/star.PNG");
	controller.setImage1(image);

	}
}
