package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class SaveExternalListController {
    @FXML private ListView AvailableLists;
    public void backButtonClicked(ActionEvent event){
        // returns to previous menu
    }
    public void ButtonReturnClicked(ActionEvent event){
        // returns to main menu using returnMain class's associated method
    }
    public void ButtonSaveClicked(ActionEvent event){
        // saves whatever lists selected to an external file specified by user
        // Users can select a single list or multiple lists (or all lists?)
        // I'll be honest, I don't know how to do this as of now
    }
}
