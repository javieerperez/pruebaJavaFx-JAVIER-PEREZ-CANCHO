package Control;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *Clase Main que ejecuta la app y muestra la primera pantalla
 * @author Javier Perez Cancho
 */
public class MainFX extends Application {
	
	
	AnchorPane mypane;
	
	@Override
	public void start(Stage primaryStage) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
		mypane = (AnchorPane) loader.load();
		primaryStage.setTitle("Login");
		primaryStage.setScene(new Scene(mypane));
		primaryStage.show();
	}
	public static void main(String[] args) {
        launch(args);
	}
}
