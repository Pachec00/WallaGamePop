package app.gui.login;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class loginController {

	@FXML
	private ImageView vista;

	@FXML
	public void imagen() {
		FadeTransition ft = new FadeTransition();
		ft.setNode(vista);
		ft.setDuration(new Duration(400));
		ft.setFromValue(1.0);
		ft.setToValue(0.0);
		ft.setCycleCount(5);
		ft.setAutoReverse(false);
		vista.setOnKeyPressed(evt -> ft.play());

	}

}
