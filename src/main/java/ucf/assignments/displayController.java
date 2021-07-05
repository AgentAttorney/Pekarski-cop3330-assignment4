package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class displayController implements Initializable {
    @FXML private TextField chooseListName;
    @FXML private ChoiceBox Complete;
    @FXML private ChoiceBox Incomplete;
    public void BackButtonClicked(ActionEvent event){
        // returns to previous menu
    }
    public void ButtonConfirmClicked(ActionEvent event){
        // Displays / Prints all items of chosen List
    }
    public void ButtonReturnClicked(ActionEvent event){
        // Returns to the main menu using returnMain class's method
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Complete and Incomplete will be initialized
        // Based on checkbox parameters for Complete and Incomplete
        // chooseListName will be initialized based on user input
    }
}
