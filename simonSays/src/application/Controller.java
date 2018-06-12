package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.SequentialTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 * Cette classe fait le liens entre l'interface utilisateur fxml et le code Java. 
 * Il gère toutes les actions de l'interface utilisateur et les relie à la classe Simon Says.
 */

public class Controller implements Initializable{
	//créée un objet Simon Says 
	SimonSays ss = new SimonSays();
	//créée une liste à partir de l'objet SimonSays
	ArrayList<String> sequence = ss.getSequence();
	
	
    @FXML
    private Rectangle btnVert;

    @FXML
    private Rectangle btnRouge;

    @FXML
    private Rectangle btnJaune;

    @FXML
    private Rectangle btnBleu;

    @FXML
    private Button btnStart;
    
    @FXML
    private Button btnTuto;
    
     @FXML
    private Button btnExit;
    
    /**
     * Cette méthode gères les actions des boutons. 
     * Le bouton start lancera une partie
     * Le bouton tuto affichera dans une aletre la facon de jouer au Simon Says
     * Le bouton exit fermera le jeu.
     */
     
    @FXML
    private void actionBouton(ActionEvent e) {
    	if(e.getSource() == btnStart){
    		ss.start();
    		for(String help: ss.getSequence()){
    			System.out.println(help);
    		}
    		colors(ss.getSequence());
    	}
    	if(e.getSource()== btnTuto){
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Simon Says");
    		alert.setHeaderText("Comment jouer au Simon Says ?");
    		alert.setContentText("Clique sur le bouton start, et certaines pièces vont s'allumer. Clique sur les piéces dans l'ordre, et le jeu continue jusqu'a ce que tu fasses une erreur.");
    		alert.show();
    	}
        if(e.getSource() == btnExit){
            System.exit(1);
        }
    }
    /**
     * Cette méthode gère les clics sur les pièces de couleur
     * et vérifie si elles sont correctes par rapport à la séquence.
     * Sinon il affiche une alerte que le jeu est fini. 
     */
    @FXML
    private void userInput(MouseEvent e){
    	if(ss.isGameOn()){	
    		if(e.getSource()==btnVert){
    			if(!ss.checkSequence("v")){
    				alertGameOver();
    			}
    		}
    		if(e.getSource()==btnRouge){
	    		if(!ss.checkSequence("r")){
	    			alertGameOver();
	    		}
	    	}
    		if(e.getSource()==btnJaune){
    			if(!ss.checkSequence("j")){
    				alertGameOver();
    			}
    		}
    		if(e.getSource()==btnBleu){
    			if(!ss.checkSequence("b")){
    				alertGameOver();
    			}
    		}
    		if(ss.getIndex() == 0){
    			colors(ss.getSequence());
    		}
    		
    	}
    	else{
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Simon Says");
    		alert.setHeaderText("Clique sur le bouton Start !");
    		alert.setContentText("Cliquer sur le bouton Start pour commencer la partie.");
    		alert.show();

    	}
    }
    

    /**
     * Cette méthode alerte l'utilisateur que le jeu est terminé. 
     */
    
    private void alertGameOver(){
    	Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Simon Says");
		alert.setHeaderText("Game Over");
		alert.setContentText("Cliquer sur le bouton Start pour recommencer une partie.");
		alert.show();
    }
    
    /**
     * Cette méthode fait clignoter les pièces de couleur pour montrer la séquence
     */
    
    public void colors(ArrayList<String> sequence){
    	SequentialTransition s = new SequentialTransition();
    	s.setCycleCount(1);
    	s.setAutoReverse(false);
    	for(int i = 0; i < sequence.size(); i++){
    		switch(sequence.get(i)){
    		case "v":
    		   FadeTransition ftvert = new FadeTransition(Duration.millis(300), btnVert);
    			ftvert.setAutoReverse(true);
    			ftvert.setFromValue(1.0);
    			ftvert.setToValue(0.5);
    			ftvert.setCycleCount(2);
    			s.getChildren().add(ftvert);
    			break;
    		case "r":
    		    FadeTransition ftrouge = new FadeTransition(Duration.millis(300), btnRouge);
    			ftrouge.setAutoReverse(true);
    			ftrouge.setFromValue(1.0);
    			ftrouge.setToValue(0.5);
    			ftrouge.setCycleCount(2);
    			s.getChildren().add(ftrouge);
    			break;
    		case "j":
    		    FadeTransition ftjaune = new FadeTransition(Duration.millis(300), btnJaune);
    			ftjaune.setAutoReverse(true);
    			ftjaune.setFromValue(1.0);
    			ftjaune.setToValue(0.5);
    			ftjaune.setCycleCount(2);
    			s.getChildren().add(ftjaune);

    			break;
    		case "b":
    		    FadeTransition ftbleu = new FadeTransition(Duration.millis(300), btnBleu);
    			ftbleu.setAutoReverse(true);
    			ftbleu.setFromValue(1.0);
    			ftbleu.setToValue(0.5);
    			ftbleu.setCycleCount(2);
    			s.getChildren().add(ftbleu);
    			break;
    		}
    	}
    	s.play();
    }
    /**
     * Méthode d'initialisation des attributs FXML.
     */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	

}
