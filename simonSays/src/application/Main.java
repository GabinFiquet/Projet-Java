package application;
	
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

/**
 * Cette classe lance l'application.
 * Elle créée la vue définie dans le fichier .fxml 
 */

public class Main extends Application {
	private Stage primaryStage; 
	private AnchorPane rootLayout; 
	        
	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage; 
			primaryStage.setTitle("Simon Says");
			
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("GUI.fxml"));
			rootLayout = (AnchorPane) loader.load(); 
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Lance l'applications 
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
