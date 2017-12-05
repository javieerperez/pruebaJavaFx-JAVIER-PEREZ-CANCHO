package Control;

import java.io.IOException;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * The only controller for the whole application.
 * 
 * @author Javier Perez Cancho
 */

public class ControlFX {

	/**
	 * Metodo al que llama el metodo handleSend()
	 */
	public void cambiarEscena() {
		try {
			FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(MainFX.class.getResource("FreeSolo.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("FREESOLO");
			Scene scene = new Scene(page);
			sendStage.setScene(scene);
			sendStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *Metodo que recibe la orden del boton y llama a cambiarEscena() para hacer su trabajo.
	 */
	@FXML
	private void handleSend() {
		cambiarEscena();
	}
	@FXML
	private void SalirAPP(){
		System.exit(0);
	}
}
