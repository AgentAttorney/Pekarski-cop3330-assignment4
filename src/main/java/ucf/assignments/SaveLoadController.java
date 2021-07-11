package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.event.ActionEvent;

import java.io.IOException;

public class SaveLoadController {
    public void ButtonBackMMClicked(ActionEvent event) throws IOException {
        // call returnMain class's associated method to return to main menu
        returnMain.returnToMainMenu(event);
        // consistent since it goes back submenu
    }
    public void ButtonSaveClicked(ActionEvent event){
        // make a new parent using the saveList fxml file
        // make a new scene using this parent
        // make and set a new Stage by getting the Source, Scene, and Window of the event
        // set scene of new Stage with our new scene
        //  display the window

    }
    public void ButtonLoadClicked(ActionEvent event){
        // make a new parent using the LoadList fxml file
        // make a new scene using this parent
        // make and set a new Stage by getting the Source, Scene, and Window of the event
        // set scene of new Stage with our new scene
        //  display the window
    }
}
