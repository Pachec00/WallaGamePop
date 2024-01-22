package src.app.gui;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.Usuario;
import service.UsuarioService;

public class AppController {

	public static Stage primaryStage;

	protected Usuario usuario;
	
	protected UsuarioService usuSer;
	
	public AppController() {
		
		usuSer=new UsuarioService();
		
	}

	public AppController(Stage stage) {
		primaryStage = stage;
	}

	public AppController cambiarVista(String fxml) {
		try {

			URL url = App.class.getResource(fxml);
			FXMLLoader loader = new FXMLLoader(url);
			Scene scene = new Scene(loader.load());
			primaryStage.setScene(scene);
			return loader.getController();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public AppController tenerController(String fxml) {
		URL url = App.class.getResource(fxml);
		FXMLLoader loader = new FXMLLoader(url);
		return loader.getController();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public UsuarioService getUsuSer() {
		return usuSer;
	}

	public void setUsuSer(UsuarioService usuSer) {
		this.usuSer = usuSer;
	}
	

}
