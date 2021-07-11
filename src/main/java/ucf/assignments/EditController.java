package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.event.ActionEvent;

import java.io.IOException;

public class EditController {
    public void ButtonBackMMClicked(ActionEvent event) throws IOException {
        // calls returnMain class's associated method to return to main menu
        returnMain.returnToMainMenu(event);
        // consistent as it goes back one submenu
    }
    public void ButtonListClicked(ActionEvent event){
        // make a new parent using the EditList fxml file
        // make a new scene using this parent
        // make and set a new Stage by getting the Source, Scene, and Window of the event
        // set scene of new Stage with our new scene
        //  display the window
    }
    public void ButtonItemClicked(ActionEvent event){
        // make a new parent using the EditItem fxml file
        // make a new scene using this parent
        // make and set a new Stage by getting the Source, Scene, and Window of the event
        // set scene of new Stage with our new scene
        //  display the window
    }
}
