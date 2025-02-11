package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtTime;
    
    @FXML
    private Button btnCancella;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	String parole = txtParola.getText();
    	double start=System.nanoTime();
    	elenco.addParola(parole);
    	double stop=System.nanoTime();
    	txtParola.clear();
    	String s="";
    	for(String p:elenco.getElenco()) {
    		s=s+p+"\n";
    	}
    	txtResult.setText(s);
    	txtTime.setText(Double.toString(stop-start));
    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	txtResult.clear();
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	String p=txtResult.getSelectedText();
    	double start=System.nanoTime();
    	elenco.cancella(p);
    	double stop=System.nanoTime();
    	txtResult.clear();
    	String s="";
    	for(String d:elenco.getElenco()) {
    		s=s+d+"\n";
    	}
    	txtResult.setText(s);
    	txtTime.setText(Double.toString(stop-start));
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
