package application; 

import java.lang.Math;
import java.util.ArrayList;

/**
 * Cette classe permet de gérer une de partie de Simon Says. 
 * En créant une séquence de démarrage, la compare avec
 * la séquence de l'utilisateur et met fin à la partie.
 */

public class SimonSays{
	private int index; 
	private final int STARTTURNS = 1; 
	public ArrayList<String> sequence; 
	private final String[] COLORS = {"v", "r", "j", "b"};
	private boolean gameOn; 
	
	/**
	 * Constructeur de l'objet SimonSays
         * Il fixe l'index a 0, créée une liste pour la sequence et met GameON à faux. 
	 */
        
	public SimonSays(){
		index = 0;
		sequence = new ArrayList<String>();
		setGameOn(false); 
	}
	
	/**
	 * Cette methode commence une partie en générant une séquence aléatoire
         * et en mettant GameOn à vrai. 
	 */
        
	public void start(){
		sequence.clear();
		generateRandomSequence();
		setGameOn(true);
		index = 0; 
	}
        
	/**
         * Cette methode génere une séquence aléatoire aussi long que la variables STARTTURNS
	 * Et ajoute une couleur (v, r, j, ou b) à la liste séquence. 
	 */
        
	private void generateRandomSequence(){
		for(int i = 0; i < STARTTURNS; i++){
			sequence.add(randomColor()); 
		}
	}
        
	/**
         * Cette méthode vérifie si l'entrée utilisateur est correcte.
         * Si c'est correcte : le jeu continu et ajoute une couleur à la séquence
         * Si c'est faux : le jeu ce termine.
	 */
        
	public boolean checkSequence(String color){
		if((sequence.get(index)).equals(color)){
			if(index == (sequence.size()-1)){
				addToSequence();
				index=0;
				return true;
			}
			index++;
			return true; 
		}
		else{
			endGame();
			return false; 
		}
	}
	/**
	 * Cette méthode met fin à la partie.
         * Il fixe l'index a 0, nettoie la liste pour la sequence et met GameON à faux.  
	 */
	public void endGame(){
		index = 0;
		sequence.clear();
		setGameOn(false); 
	}
	
	/**
	 * Cette méthode ajoute une couleur aléatoire (r,v,j ou b) à la séquence
	 */
	public void addToSequence(){
		sequence.add(randomColor());
		for(String help: getSequence()){
			System.out.println(help);
		}
	}
	
	/**
	 * Cette méthode retourne une couleur aléatoire (v, r, j, b)
	 */
	private String randomColor(){
		return COLORS[(int) (Math.random()*4)]; 
	}

	/**
	 * Retourne un index
	 */
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	/**
	 * Retourne la liste séquence
	 */
	public ArrayList<String> getSequence() {
		return sequence;
	}
	
	public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}

	/**
	 * Retourne gameOn
	 */
	public boolean isGameOn() {
		return gameOn;
	}
	public void setGameOn(boolean gameOn) {
		this.gameOn = gameOn;
	}
	
}