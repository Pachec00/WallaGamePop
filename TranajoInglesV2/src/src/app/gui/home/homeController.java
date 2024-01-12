package src.app.gui.home;

import java.awt.event.ActionEvent;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;

import javafx.scene.layout.AnchorPane;

import javafx.util.Duration;
import src.app.gui.AppController;

public class homeController extends AppController {

	@FXML
	private AnchorPane pane;

	@FXML
	public void initialize(ActionEvent event) {
		pane.setOpacity(0);
		entrar();
	}

	@FXML
	public void entrar() {
		FadeTransition ft = new FadeTransition();
		ft.setDuration(Duration.millis(1000));
		ft.setNode(pane);
		ft.setFromValue(0);
		ft.setToValue(1);

		ft.play();

	}

}
