package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EditListController implements Initializable {
    @FXML private TextField newListName;
    @FXML private ListView ListToEdit;
    public void ButtonBackEditClicked(ActionEvent event){
        // returns to previous menu
    }
    //String ListNameText
    public void ButtonConfirmClicked(ActionEvent event){
        // Edits the list specified
    }
    public void ButtonReturnClicked(ActionEvent event){
        // returns to main menu using returnMain's associated class method
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // ListToEdit is initialized by user selection
        // User initializes newListName with their input
        // Notifies user and greys out Confirm button if the name is not valid
        // Once the button is valid, it should ungrey itself
    }
}
