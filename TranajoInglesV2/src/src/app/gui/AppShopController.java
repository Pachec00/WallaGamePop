package src.app.gui;

import java.math.BigDecimal;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import modelo.Producto;

public class AppShopController extends AppController {

	private static Integer cont;

	@FXML
	private Label labelContador;

	public AppShopController() {
		super();

	}

	public AppShopController(Stage stage) {
		super(stage);

		cont = 0;

	}

	@FXML
	public void add(Event e) {
			if(usuario==null) {
				cambiarVista(FXMLPaths.PANTALLAINIREGI);
			}else {		
			cont++;
			Producto product = new Producto();
			Button btn = (Button) e.getSource();
			String id = btn.getId();
			if (id.equalsIgnoreCase("addstar")) {

				product.setNombre("Starfield");
				product.setPrecio(new BigDecimal(40));
				usuario.getListaProductos().add(product);

			} else if (id.equalsIgnoreCase("addSpiderman")) {
				product.setNombre("Spiderman");
				
				product.setPrecio(new BigDecimal(20));
				usuario.getListaProductos().add(product);
			} else if (id.equalsIgnoreCase("addLastOU")) {
				product.setNombre("Lou");
				product.setPrecio(new BigDecimal(36));
				usuario.getListaProductos().add(product);
			} else {
				product.setNombre("DemonSouls");
				product.setPrecio(new BigDecimal(15));
				usuario.getListaProductos().add(product);
			}

			cambiarVista(FXMLPaths.PANTALLA_2);
			}

	}

	public void initialize() {
	
		labelContador.setText(cont.toString());
		System.out.println(cont);
		
	}

}
