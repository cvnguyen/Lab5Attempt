package poker.app.view;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import enums.eGame;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser;
import poker.app.MainApp;
import pokerBase.Action;
import pokerBase.GamePlay;
import pokerBase.Rule;

/**
 * The controller for the root layout. The root layout provides the basic
 * application layout containing a menu bar and space where other JavaFX
 * elements can be placed.
 * 
 * @author Marco Jakob
 */
public class RootLayoutController implements Initializable {

    // Reference to the main application
    private MainApp mainApp;

    @FXML
    private Menu mnuGame;
    @FXML
    private RadioMenuItem FiveCardDraw;
    @FXML
    private RadioMenuItem FiveCardJoker;
    @FXML
    private RadioMenuItem FiveCardWilds;
    @FXML
    private RadioMenuItem SevenCardDraw;
    @FXML
    private RadioMenuItem TexasHoldEm;
    @FXML
    private RadioMenuItem Omaha;
  
    
    
    @FXML
    private ToggleGroup tglGames;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	 
/*		CheckMenuItem item1 = new CheckMenuItem("5 card stud");
        item1.selectedProperty().addListener(new ChangeListener(){
            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(1);              
            }            
          });
		
		
		mnuGame.getItems().add(item1);
		
		
		
		CheckMenuItem item2 = new CheckMenuItem("5 card draw");
        item2.selectedProperty().addListener(new ChangeListener(){
            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(2);              
            }            
          });
		
		
		mnuGame.getItems().add(item2);*/
		
		
	}
	

	
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    /**
     * Creates an empty address book.
     */
    @FXML
    private void handleNew() {
    }

    /**
     * Opens a FileChooser to let the user select an address book to load.
     */
    @FXML
    private void handleOpen() {
    }

    /**
     * Saves the file to the person file that is currently open. If there is no
     * open file, the "save as" dialog is shown.
     */
    @FXML
    private void handleSave() {
    }

    /**
     * Opens a FileChooser to let the user select a file to save to.
     */
    @FXML
    private void handleSaveAs() {
    }

    /**
     * Opens an about dialog.
     */
    @FXML
    private void handleAbout() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("AddressApp");
        alert.setHeaderText("About");
        alert.setContentText("Author: Bert Gibbons");

        alert.showAndWait();
    }

    /**
     * Closes the application.
     */
    @FXML
    private void handleExit() {
        System.exit(0);
    }
    /**
     * Opens the birthday statistics.
     */
    @FXML
    private void handleShowBirthdayStatistics() {
    }


	public ToggleGroup getTglGames() {
		return tglGames;
	}


	public void setTglGames(ToggleGroup tglGames) {
		this.tglGames = tglGames;
	}

	
	
	
			//HANDLING GAMES
    //figure out why this code is not working
	@FXML
	 private void handleFiveStud(){
	    if (FiveCardDraw.isSelected()) {
	    	mainApp.setiGameType(eGame.FiveStud);
	    }
	    	
	}
	
	@FXML
	private void handleFiveStudOneJoker(){
    	if (FiveCardJoker.isSelected()) {
    		mainApp.setiGameType(eGame.FiveStudOneJoker);
    	}
    	
    }
	@FXML
    private void handleFiveStudTwoJoker(){
    	if (FiveCardWilds.isSelected()) {
    		mainApp.setiGameType(eGame.FiveStudTwoJoker);
    	}
    	
    }
	@FXML
    private void handleTexasHoldEm(){
    	if (TexasHoldEm.isSelected()) {
    		mainApp.setiGameType(eGame.TexasHoldEm);
    	}
    	
    }
	@FXML
    private void handleSevenDraw(){
    	if (SevenCardDraw.isSelected()) {
    		mainApp.setiGameType(eGame.SevenDraw);
    	}
    }
	
	@FXML
    private void handleOmaha(){
    	if (Omaha.isSelected()) {
    		mainApp.setiGameType(eGame.Omaha);
    	}
    	
    }
	



}