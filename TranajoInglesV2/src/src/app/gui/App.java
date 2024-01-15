package src.app.gui;

import javafx.application.Application;

import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		AppController controller = new AppController(primaryStage);
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
