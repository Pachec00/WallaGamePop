package src.app.gui.login;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import src.app.gui.AppController;

public class loginController extends AppController {

	@FXML
	private ImageView vista;

	@FXML
	public void imagen() {
		FadeTransition ft = new FadeTransition();
//		ft.setNode(cargarFXML(FXMLPaths.PANTALLA_2));
		ft.setNode(vista);
		ft.setDuration(new Duration(4000));
		ft.setFromValue(1.0);
		ft.setToValue(0.0);
		ft.setCycleCount(1);
		ft.setAutoReverse(false);
		vista.setOnMouseMoved(evt -> ft.play());

	}

}
