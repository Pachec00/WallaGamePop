package src.app.gui;

import javafx.application.Application;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		AppShopController controller = new AppShopController(primaryStage);
	
		controller.cambiarVista(FXMLPaths.LOGIN);
		primaryStage.show();
		primaryStage.setMaxHeight(710);
		primaryStage.setMaxWidth(799);
		primaryStage.setMinHeight(710);
		primaryStage.setMinWidth(799);
		primaryStage.setResizable(false);

	}

	public static void main(String[] args) {

		launch();
	}

}
