package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.io.IOException;

public class SaveExternalListController {
    @FXML private ListView AvailableLists;
    public void backButtonClicked(ActionEvent event) throws IOException {
        // returns to previous menu
        SceneManager.changeScene(event,"SaveLoad.FXML");
        // call the SceneManager class with our FXML Name
    }
    public void ButtonReturnClicked(ActionEvent event) throws IOException {
        // returns to main menu using returnMain class's associated method
        returnMain.returnToMainMenu(event);
    }
    public void ButtonSaveClicked(ActionEvent event){
        // separate method for actually saving the file would be called here
        // saves whatever lists selected to an external file specified by user
        // Users can select a single list or multiple lists (or all lists?)
        // a separate method maybe for making a file
        // then I read the data to the file using a format like
        // ToDoListName Item1 Item1DD Item1Desc Item2 Item2DD Item2Desc
        // Likely going to limit file type to .txt
        // I'll be honest, I don't know how to do this as of now
    }
}
