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
        // call Scene Manager with name of FXML file
    }
    public void ButtonDisplayClicked(javafx.event.ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"Display.FXML");
        // call Scene Manager with FXML file name
    }
    public void ButtonSaveLoadClicked(javafx.event.ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"SaveLoad.FXML");
        // call Scene Manager with FXML file name
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


