package application.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController implements EventHandler<ActionEvent>{

	@FXML
	Label outputLabel;
	
	@Override
	public void handle( ActionEvent event ) {
		
		Button button = (Button) event.getSource();
		String id = button.getText();
		
		outputLabel.setText( id );
	}

}
