package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class LoadExternalListController {
    //String ListName
    //String fileNameExStorage
    @FXML private ListView AvailableLists;
    public void backButtonClicked(ActionEvent event){
        // returns to previous menu
    }
    public void ButtonReturnClicked(ActionEvent event){
        // return to main menu, using returnMenu class's associated method
    }
    public void ButtonOKClicked(ActionEvent event){
        /*
         calls a method that loads a specified List and FileName (LoadList)
         If no list is specified, load all lists from specified fileName using loadLists
        */
    }
}
