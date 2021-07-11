package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ToDoListMainMenuController {
    ToDoList tdl = new ToDoList();

    public void ButtonAddClicked(javafx.event.ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"Add.FXML");
        // call the SceneManager class with our FXML Name
    }
    public void ButtonRemoveClicked(javafx.event.ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"Remove.FXML");
        // call the SceneManager class with our FXML name
    }
    public void ButtonEditClicked(javafx.event.ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"Edit.FXML");
        // make a new parent using the Edit fxml file
        // make a new scene using this parent
        // make and set a new Stage by getting the Source, Scene, and Window of the event
        // set scene of new Stage with our new scene
        //  display the window
    }
    public void ButtonDisplayClicked(javafx.event.ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"Display.FXML");
        // make a new parent using the Display fxml file
        // make a new scene using this parent
        // make and set a new Stage by getting the Source, Scene, and Window of the event
        // set scene of new Stage with our new scene
        //  display the window
    }
    public void ButtonSaveLoadClicked(javafx.event.ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"SaveLoad.FXML");
        // make a new parent using the SaveLoad fxml file
        // make a new scene using this parent
        // make and set a new Stage by getting the Source, Scene, and Window of the event
        // set scene of new Stage with our new scene
        //  display the window
    }
    public void ButtonExitClicked(javafx.event.ActionEvent event){
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
        // Exit the Stage/Window
    }

    public void setTdl(ToDoList mod_tdl){
        tdl = mod_tdl;
    }
    public ToDoList getTdl(){
        return tdl;
    }
}


