package ucf.assignments;

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
        // Loads the specified list ListName from user input and specified fileName
        // If no list is specified, load all lists from specified fileName
    }
}
