package gui;

import java.net.URL;
import java.util.ResourceBundle;

import Logic.PTEController;
import Logic.PTEControllerImpl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import Logic.Profil;

public class PaneUC1_UC2Controller implements Initializable{
private PTEController pteController = new PTEControllerImpl();

	@FXML
	private TextField tekstFeltVaegt;
	
	@FXML
	private TextField tekstFeltDimensionerendeKraft;
	
	@FXML
	private TextField tekstFeltVinkel;
	
	@FXML
	private TextField tekstFeltNormalkraft;
	
	@FXML
	private TextField tekstFeltForskydningskraft;
	
	@FXML
	private Toggle vandret; 
	
	@FXML
	private Toggle lodret;
	
	@FXML
	private ToggleGroup profil;
	
	@FXML
	private void haandterUdregnKnap(ActionEvent event) {
		
		getProfil();
		//getData();
		//udregn();
		//setTextFn_FT();
	}
	
	
	
	
	private void getProfil() {
		if(vandret.isSelected()){
			pteController.setProfil(Profil.VANDRET);
		}
		
	}




	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
