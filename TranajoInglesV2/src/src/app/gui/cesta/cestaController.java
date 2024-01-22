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

	


	

	@FXML
	public void compra() {
		cambiarVista(FXMLPaths.PANTALLAINIREGI);

	}

	@FXML
	public void home() {
		cambiarVista(FXMLPaths.PANTALLA_2);

	}

}
