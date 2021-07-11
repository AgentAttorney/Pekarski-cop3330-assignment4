package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.io.IOException;

public class LoadExternalListController {
    //String ListName
    //String fileNameExStorage
    @FXML private ListView AvailableLists;
    public void backButtonClicked(ActionEvent event) throws IOException {
        // returns to previous menu
        SceneManager.changeScene(event,"SaveLoad.FXML");
        // call the SceneManager class with our FXML Name
    }
    public void ButtonReturnClicked(ActionEvent event) throws IOException {
        // return to main menu, using returnMenu class's associated method
        returnMain.returnToMainMenu(event);
    }
    public void ButtonOKClicked(ActionEvent event){
        /*
         calls a method that loads a specified List and FileName (LoadList)
         If no list is specified, load all lists from specified fileName using loadLists
        */
    }
}
