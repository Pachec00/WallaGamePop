package src.app.gui.cesta;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class cestaController extends AppController {

	@FXML
	private Button boton;

	@FXML
	private Label nombre1;
	@FXML
	private Label precio1;
	@FXML
	private ImageView imagen1;

	@FXML
	private Label nombre2;
	@FXML
	private Label precio2;
	@FXML
	private ImageView imagen2;

	@FXML
	private Label nombre3;
	@FXML
	private Label precio3;
	@FXML
	private ImageView imagen3;

	@FXML
	private Label nombre4;
	@FXML
	private Label precio4;
	@FXML
	private ImageView imagen4;

	@FXML
	public void setNombre1(String nombre) {
		nombre1.setText(nombre);

	}

	@FXML
	public void setPrecio1(String precio) {
		precio1.setText(precio);

	}

	@FXML
	public void setImage1(Image imagen) {
		imagen1.setImage(imagen);

	}

	@FXML
	public void setNombre2(String nombre) {
		nombre1.setText(nombre);

	}

	@FXML
	public void setPrecio2(String precio) {
		precio1.setText(precio);

	}

	@FXML
	public void setImage2(Image imagen) {
		imagen1.setImage(imagen);

	}

	@FXML
	public void setNombre3(String nombre) {
		nombre1.setText(nombre);

	}

	@FXML
	public void setPrecio3(String precio) {
		precio1.setText(precio);

	}

	@FXML
	public void setImage3(Image imagen) {
		imagen1.setImage(imagen);

	}

	@FXML
	public void setNombre4(String nombre) {
		nombre1.setText(nombre);

	}

	@FXML
	public void setPrecio4(String precio) {
		precio1.setText(precio);

	}

	@FXML
	public void setImage4(Image imagen) {
		imagen1.setImage(imagen);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@FXML
	public void compra() {
		cambiarVista(FXMLPaths.PANTALLAINIREGI);

	}

	@FXML
	public void home() {
		cambiarVista(FXMLPaths.PANTALLA_2);

	}

}
