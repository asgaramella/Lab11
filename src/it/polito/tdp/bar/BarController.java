package it.polito.tdp.bar;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.bar.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class BarController {
	Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnSimula;

    @FXML
    private TextArea txtResult;

    @FXML
    void doSimula(ActionEvent event) {
    	model.generaArrivi();
    	model.run();
    	txtResult.appendText("Nr clienti tot del bar "+Integer.toString(model.getSt().getTotClienti())+"\n");
    	
    	txtResult.appendText("Nr clienti soddisfatti del bar "+Integer.toString(model.getSt().getClientiSoddisfatti())+"\n");
    	txtResult.appendText("Nr clienti insoddisfatti del bar "+Integer.toString(model.getSt().getClientiInsoddisfatti())+"\n");
    }

    @FXML
    void initialize() {
        assert btnSimula != null : "fx:id=\"btnSimula\" was not injected: check your FXML file 'Bar.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Bar.fxml'.";

    }

	public void setModel(Model model) {
		this.model=model;
		
	}
}

