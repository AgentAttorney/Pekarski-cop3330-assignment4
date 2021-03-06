package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class removeItemController implements Initializable {
    @FXML private ListView ListToRemove;
    @FXML private ListView ItemToRemove;
    //String fillListText
    //String fillItemText
    public void ButtonBackClicked(ActionEvent event) throws IOException {
        // returns to previous menu
        SceneManager.changeScene(event,"Remove.FXML");
        // call the SceneManager class with our FXML Name
    }
    public void ButtonConfirmClicked(ActionEvent event){
        // removes item(s) from specified list
    }
    public void ButtonReturnClicked(ActionEvent event) throws IOException {
        // call returnMenu class's associated method to return to Main Menu
        returnMain.returnToMainMenu(event);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // The ListView for ListToRemove will display all the Lists
        // Sets ListToRemove based on user selection
        // ListView for ItemToRemove changes depending on the list
        // User selects an item (or multiple), and then presses confirm
    }
}
