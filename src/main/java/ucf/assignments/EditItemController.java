package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EditItemController implements Initializable {
    @FXML private TextField UserEdit;
    @FXML private ChoiceBox ItemEdit;
    public void ButtonBackEditClicked(ActionEvent event){
        // returns to previous menu
    }
    public void ButtonConfirmClicked(ActionEvent event){
        // Call function to edit the Item's specified property in the specific list
    }
    public void ButtonReturnClicked(ActionEvent event){
        // returns to Main Menu using returnMain's associated method
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // User picks the List from the left listView
        // Once selected, the Items for that list will show in the right listView
        // The user then selects either to edit the due date or description
        // If the due date format is invalid, or any of the boxes are not filled in
        // or the user didn't specify an item or list
        // the Return and Confirm buttons will be greyed out
    }
}
