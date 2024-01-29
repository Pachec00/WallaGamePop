package src.app.gui.cesta;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
				imagenStar.setVisible(true);
				labelStar.setVisible(true);
				cantidadStar.setText(cantidad.toString());
				
			}else if(product.getNombre().equalsIgnoreCase("Spiderman")) {
				Long cantidad =  usuario.getListaProductos().stream().filter(z -> z.getNombre().equalsIgnoreCase("Spiderman")).count();   
				imagenSpiderman.setVisible(true);
				labelSpiderman.setVisible(true);
				cantidadSpiderman.setText(cantidad.toString());
				
			}else if(product.getNombre().equalsIgnoreCase("The last of us")) {
				Long cantidad =  usuario.getListaProductos().stream().filter(z -> z.getNombre().equalsIgnoreCase("Lou")).count();   
				imagenLastOU.setVisible(true);
				labelLastOU.setVisible(true);
				cantidadLastOU.setText(cantidad.toString());
				
			}else {
				Long cantidad =  usuario.getListaProductos().stream().filter(z -> z.getNombre().equalsIgnoreCase("demonSouls")).count();   
				imagenDemon.setVisible(true);
				labelDemon.setVisible(true);
				cantidadDemon.setText(cantidad.toString());
			}
			
			
		}
		
		
	}
	

}
