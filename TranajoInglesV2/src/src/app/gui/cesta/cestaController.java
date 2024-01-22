package src.app.gui.cesta;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import modelo.Producto;
import src.app.gui.AppController;
import src.app.gui.FXMLPaths;
import java.math.BigDecimal;

public class cestaController extends AppController {

	@FXML
	private Button boton;

	
	
	
    public void create() {
    Producto producto1 = new Producto("Producto 1", "imagen1.jpg", new BigDecimal(10.99));
    Producto producto2 = new Producto("Producto 2", "imagen2.jpg", new BigDecimal(15.99));
    Producto producto3 = new Producto("Producto 3", "imagen3.jpg", new BigDecimal(20.99));
    Producto producto4 = new Producto("Producto 4", "imagen4.jpg", new BigDecimal(25.99));




	

	@FXML
	public void compra() {
		cambiarVista(FXMLPaths.PANTALLAINIREGI);

	}

	@FXML
	public void home() {
		cambiarVista(FXMLPaths.PANTALLA_2);

	}

}
