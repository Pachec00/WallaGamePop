package src.app.gui.compra;

import java.math.BigDecimal;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import modelo.Producto;
import src.app.gui.AppController;
import src.app.gui.FXMLPaths;

public class compraController extends AppController {

	@FXML
	private Button boton;
	@FXML
	private Label labelPrimero;
	@FXML
	private Label labelSegundo;
	@FXML
	private Label labelTercero;
	@FXML
	private Label labelCuarto;
	@FXML
	private Label cantidadPrimero;
	@FXML
	private Label cantidadSegundo;
	@FXML
	private Label cantidadTercero;

	@FXML
	private Label cantidadCuarta;
	@FXML
	private Label subPrimero;
	@FXML
	private Label subSegundo;
	@FXML
	private Label subTercero;

	@FXML
	private Label subCuarto;
	@FXML
	private Label total;

	@FXML
	public void aceptadaSI() {
		cambiarVista(FXMLPaths.ACEPTADA);

	}

	@FXML
	public void home() {
		cambiarVista(FXMLPaths.PANTALLA_2);

	}

	@FXML
	public void cesta() {
		cambiarVista(FXMLPaths.CARRITO);

	}
	
	public void initialize() {
		BigDecimal total= new BigDecimal(0);
		for (Producto product : usuario.getListaProductos()) {
			
			if(product.getNombre().equalsIgnoreCase("Starfield")) {
				Long cantidad =  usuario.getListaProductos().stream().filter(z -> z.getNombre().equalsIgnoreCase("Starfield")).count();   
				total = total.add(product.getPrecio().multiply(new BigDecimal(cantidad)));
				rellenar(product, cantidad);
				
			}else if(product.getNombre().equalsIgnoreCase("Spiderman")) {
				Long cantidad =  usuario.getListaProductos().stream().filter(z -> z.getNombre().equalsIgnoreCase("Spiderman")).count();   
				total = total.add(product.getPrecio().multiply(new BigDecimal(cantidad)));
				rellenar(product, cantidad);
				
			}else if(product.getNombre().equalsIgnoreCase("Lou")) {
				Long cantidad =  usuario.getListaProductos().stream().filter(z -> z.getNombre().equalsIgnoreCase("Lou")).count();   
				total = total.add(product.getPrecio().multiply(new BigDecimal(cantidad)));
				rellenar(product, cantidad);
				
			}else {
				Long cantidad =  usuario.getListaProductos().stream().filter(z -> z.getNombre().equalsIgnoreCase("demonSouls")).count();   
				total = total.add(product.getPrecio().multiply(new BigDecimal(cantidad)));
				rellenar(product, cantidad);
			}
			
			
			
		}
		
		this.total.setText(total.toString());
		
		
		
		
	}
	
	public void rellenar(Producto product, Long cantidad) {
		if(labelPrimero.getText().isEmpty()) {
			labelPrimero.setText(product.getNombre());
			cantidadPrimero.setText(cantidad.toString());
			subPrimero.setText(product.getPrecio().multiply(new BigDecimal(cantidad)).toString());
		}else if(labelSegundo.getText().isEmpty()) {
			labelSegundo.setText(product.getNombre());
			cantidadSegundo.setText(cantidad.toString());
			subSegundo.setText(product.getPrecio().multiply(new BigDecimal(cantidad)).toString());
		}else if(labelTercero.getText().isEmpty()) {
			labelTercero.setText(product.getNombre());
			cantidadTercero.setText(cantidad.toString());
			subTercero.setText(product.getPrecio().multiply(new BigDecimal(cantidad)).toString());
		}else {
			labelCuarto.setText(product.getNombre());
			cantidadCuarta.setText(cantidad.toString());
			subCuarto.setText(product.getPrecio().multiply(new BigDecimal(cantidad)).toString());
		}
	}

}
