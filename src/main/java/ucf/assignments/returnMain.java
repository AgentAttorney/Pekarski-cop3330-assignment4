package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class returnMain {
    public static void returnToMainMenu(ActionEvent event) throws IOException { // Same regardless of event so static
        // make a new parent using the ToDoListMainMenuController fxml file
        Parent back_to_root = FXMLLoader.load(returnMain.class.getResource("ToDoListMainMenu.FXML"));
        // make a new scene using this parent
        Scene main_scene = new Scene(back_to_root);
        // make and set a new Stage by getting the Source, Scene, and Window of the event
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        // set scene of new Stage with our new scene
        window.setScene(main_scene);
        //  display the window
        window.show();
    }
}
