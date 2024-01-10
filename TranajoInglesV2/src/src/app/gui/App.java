package app.gui;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/app/gui/loginin/login.fxml"));
		Scene scene = new Scene(fxmlLoader.load());
		primaryStage.setScene(scene);
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
