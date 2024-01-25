package src.app.gui.home;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import src.app.gui.AppShopController;
import src.app.gui.FXMLPaths;

public class homeController extends AppShopController {

	@FXML
	private Button boton;
	
    @FXML
    private Label contador;

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

		if(usuario==null) {
			cambiarVista(FXMLPaths.PANTALLAINIREGI);
		}else {
			cambiarVista(FXMLPaths.CARRITO);
			
		}

	}

}
