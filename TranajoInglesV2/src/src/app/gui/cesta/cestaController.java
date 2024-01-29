package src.app.gui.cesta;

import java.math.BigDecimal;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modelo.Producto;
import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class cestaController extends AppController {

	@FXML
	private Button boton;
	@FXML
	private ImageView imagenStar;
	@FXML
	private  ImageView imagenSpiderman;
	@FXML
	private ImageView imagenLastOU;
	@FXML
	private  ImageView imagenDemon;
	@FXML
	private Label labelStar;
	@FXML
	private Label labelSpiderman;
	@FXML
	private Label labelLastOU;
	@FXML
	private Label labelDemon;
	@FXML
	private  Label precioStar;
	@FXML
	private  Label precioSpiderman;
	@FXML
	private  Label precioLastOU;
	@FXML
	private  Label precioDemon;
	@FXML
	private  Label cantidadStar;
	@FXML
	private  Label cantidadSpiderman;
	@FXML
	private  Label cantidadLastOU;
	@FXML
	private  Label cantidadDemon;

	public cestaController() {

		
	}

	@FXML
	public void compra() {
	
	
			cambiarVista(FXMLPaths.COMPRA);
	
	}

	@FXML
	public void home() {
		cambiarVista(FXMLPaths.PANTALLA_2);

	}

	

	public void initialize() {
	
		for (Producto product : usuario.getListaProductos()) {
			
			if(product.getNombre().equalsIgnoreCase("Starfield")) {
				Long cantidad =  usuario.getListaProductos().stream().filter(z -> z.getNombre().equalsIgnoreCase("Starfield")).count();   							
				rellenar(product, cantidad);
				
			}else if(product.getNombre().equalsIgnoreCase("Spiderman")) {
				Long cantidad =  usuario.getListaProductos().stream().filter(z -> z.getNombre().equalsIgnoreCase("Spiderman")).count();   
				rellenar(product, cantidad);
				
			}else if(product.getNombre().equalsIgnoreCase("The last of us")) {
				Long cantidad =  usuario.getListaProductos().stream().filter(z -> z.getNombre().equalsIgnoreCase("The last of us")).count();   
				rellenar(product, cantidad);
				
			}else {
				Long cantidad =  usuario.getListaProductos().stream().filter(z -> z.getNombre().equalsIgnoreCase("demonSouls")).count();   
				rellenar(product, cantidad);
			}
			
			
		}
		
		
	}
	public void rellenar(Producto product, Long cantidad) {
		if(labelStar.getText().isEmpty()) {
			labelStar.setText(product.getNombre());
			cantidadStar.setText(cantidad.toString());			
			Image image1 = new Image(getClass().getResource(product.getImagen()).toString());
			imagenStar.setImage(image1);
		}else if(labelSpiderman.getText().isEmpty()) {
			labelSpiderman.setText(product.getNombre());
			cantidadSpiderman.setText(cantidad.toString());
			Image image1 = new Image(getClass().getResource(product.getImagen()).toString());
			imagenSpiderman.setImage(image1);	
		}else if(labelLastOU.getText().isEmpty()) {
			labelLastOU.setText(product.getNombre());
			cantidadLastOU.setText(cantidad.toString());
			Image image1 = new Image(getClass().getResource(product.getImagen()).toString());
			imagenLastOU.setImage(image1);	
		}else {
			labelDemon.setText(product.getNombre());
			cantidadDemon.setText(cantidad.toString());
			Image image1 = new Image(getClass().getResource(product.getImagen()).toString());
			imagenDemon.setImage(image1);	
		}
	}
	

}
