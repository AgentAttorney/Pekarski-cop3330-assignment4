package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class addItemController implements Initializable {

     @FXML private ListView chooseListAdd;
     @FXML private TextField chooseItemAdd;
    public void ButtonBackClicked(ActionEvent event){
        // go back one submenu
    }
    public void ButtonOKClicked(ActionEvent event){
        // adds the menu item to the associated list using what the user fills in
    }
    public void ButtonFinishClicked(ActionEvent event){
        // calls the returnMainMenu method from the associated class
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // For our chooseListAdd ListView Object
        // We have it get all the To-do list names from our master list
        // The user types in an item name, notified with text if the itemName is invalid
        // The Confirm and Return buttons will also be greyed out / unclickable from this
        // The User will then click the confirm button
        // It will call a function to add that item to that list
        // After which, the user can continue inputting items or click Return to Main Menu
    }
}
