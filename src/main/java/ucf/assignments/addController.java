package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class addController {
    @FXML
    Label label;
    public void ButtonBackMMClicked(javafx.event.ActionEvent event) throws IOException {
        // call the returnToMainMenu method from the associated class
        returnMain.returnToMainMenu(event);
        // It goes back one submenu, so its consistent
    }
    public void ButtonListClicked(javafx.event.ActionEvent event) throws IOException {
        Node node = (Node)event.getSource();
        SceneManager.changeScene(event,"addList.FXML");
        // make a new parent using fxml file
        // make a new scene using this parent
        // make and set a new Stage by getting the Source, Scene, and Window of the event
        // set scene of new Stage with our new scene
        //  display the window
    }
    public void ButtonItemClicked(javafx.event.ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        SceneManager.changeScene(event,"addItem.FXML");
        // make a new parent using fxml file
        // make a new scene using this parent
        // make and set a new Stage by getting the Source, Scene, and Window of the event
        // set scene of new Stage with our new scene
        //  display the window
    }
}
