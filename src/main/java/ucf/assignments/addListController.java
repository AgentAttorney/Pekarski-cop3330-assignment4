package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class addListController implements Initializable {
    public void ButtonBackAddClicked(javafx.event.ActionEvent event){
        // returns to the previous screen
    }
    @FXML private TextField NameNewList;
    public void ButtonOKClicked(javafx.event.ActionEvent event){
        // adds the List to the Collection of To-Do Lists
        // If the list has an invalid name (Shares a name with an existing list)
        // The confirm and return buttons will be greyed out / unclickable
        // The user then has the option of entering a new list name or leaving
    }
    public void ButtonReturnClicked(javafx.event.ActionEvent event){
        // call The returnMain class's method here
        // returns to main menu using that method
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // initializes user input for the text field
    }
}
