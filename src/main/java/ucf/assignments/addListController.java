package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class addListController implements Initializable {
    @FXML private TextField NameNewList;

    public void ButtonBackAddClicked(javafx.event.ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"Add.FXML");
        // returns to the previous screen calling the SceneManager
    }
    public void ButtonConfirmClicked(javafx.event.ActionEvent event) throws IOException {
        // These 3 lines of code are designed to get the controller so I can get access to its methods
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ToDoListMainMenu.fxml"));
        Parent root = loader.load();
        ToDoListMainMenuController addCommand = loader.getController();

        if(NameNewList.getText() != null){
            addCommand.getTdl().setListName(NameNewList.getText());
            NameNewList.setText("");
        }
        // I could call the returnMain method here but I decided not to.
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ButtonReturnClicked(javafx.event.ActionEvent event) throws IOException {
        // call The returnMain class's method here
        returnMain.returnToMainMenu(event);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        NameNewList.setText("");
        // initializes user input for the text field
    }
}
