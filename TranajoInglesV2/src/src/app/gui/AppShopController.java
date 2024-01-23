package src.app.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

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
	public void add() {
		if(usuario==null) {
			cambiarVista(FXMLPaths.INICIAR);
		}else {
			cont++;			
			cambiarVista(FXMLPaths.PANTALLA_2);
		}

	}

	public void initialize() {
		
		labelContador.setText(cont.toString());
		System.out.println(cont);
	}

}
