package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.io.IOException;

public class removeListController {
    @FXML private ListView AvailableLists;
    public void ButtonBackRemoveClicked(ActionEvent event) throws IOException {
        // returns to the previous menu
        SceneManager.changeScene(event,"Remove.FXML");
        // call the SceneManager class with our FXML Name
    }
    //String fillListText
    public void ButtonConfirmClicked(ActionEvent event){
        // have a pop-up window show up notifying the user that deleting a List deletes all items
        // On the list.
    }
    public void ButtonReturnClicked(ActionEvent event) throws IOException {
        // returns to the main menu
        returnMain.returnToMainMenu(event);
    }
}
