package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.event.ActionEvent;

import java.io.IOException;

public class removeController {
    public void  ButtonBackMMClicked(ActionEvent event) throws IOException {
        // calls the returnMenu class to return to main menu
        returnMain.returnToMainMenu(event);
        // one submenu back, so consistent
    }
    public void ButtonListClicked(ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"RemoveItem.FXML");
        // changes scene using FXMl file name
    }
    public void ButtonItemClicked(ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"RemoveItem.FXML");
        // changes scene using FXMl file name
    }
}
