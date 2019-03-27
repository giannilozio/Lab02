package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.Dictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
    
	Dictionary dizionario;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	dizionario = new Dictionary();
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	String input= txtWord.getText().toLowerCase();
    	txtWord.clear();
    	if(input.matches("[A-Za-z? ]*")) {
    		String[] parola= input.split(" ");
    		
    		if(parola.length==1) {
    			txtResult.clear();
    			txtResult.appendText("Il significato della parola " + parola[0] + " è: " + dizionario.translateWord(parola[0]));
        		return;
    		}else
    			txtResult.clear();
        			txtResult.appendText("Il significato della parola " + input + " non è presente nei nostri database.");  
    		
    		if(parola.length==2) {
    			dizionario.addWord(parola[0], parola[1]);
    			txtResult.clear();
        		txtResult.appendText("La parola " + parola[0] + " avente traduzione " + parola[1] +
        				" è stata inserita con successo nei nostri database.");
        		
        		
        		    		
        	} else
        		
        		txtResult.appendText("Attenzione, l'input non è valido!"
        				+ "\nPer inserire una nuova parola nel database utilizzare il formato '*PAROLA_ALINA* *TRADUZIONE*'"
        				+ "\n Per tradurre una parola aliena utilizzare il formato '*PAROLA_ALIENA*'");
    		
    	}
    	else {
    		txtResult.clear();
    		txtResult.appendText("Attenzione, l'input non è valido!"
    				+ "\nPossono essere accettate solo lettere maiuscole o minuscole");
    		
    	}
    			
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();

    }
    
}
