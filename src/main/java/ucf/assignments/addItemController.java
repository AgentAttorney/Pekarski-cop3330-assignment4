package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
public class addItemController implements Initializable {
    Items item_to_add = new Items();
    @FXML
    private ListView<String> chooseListAdd;
    @FXML
    private TextField DueDate;
    @FXML
    private TextField Description;
    @FXML
    private Button ConfirmButton;

    public void ButtonBackClicked(ActionEvent event) throws IOException {
        SceneManager.changeScene(event, "Add.FXML");
    }
    public void ValidateButtonClicked(ActionEvent event){
        // checks if user input has the right formats
        if (item_to_add.validFormat(DueDate.getText()) && (item_to_add.validDesc(Description.getText()))){
            ConfirmButton.setDisable(false);
        }
        else{
            ConfirmButton.setDisable(true);
        }
    }

    public void ButtonConfirmClicked(ActionEvent event) throws IOException {
        // These 3 lines of code are designed to get the controller so I can get access to its method
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ToDoListMainMenu.fxml"));
        Parent root = loader.load();
        ToDoListMainMenuController controller = loader.getController();

        // Set the properties of the item and add the item to the List
        item_to_add.setDue_Date(DueDate.getText());
        item_to_add.setDescription(Description.getText());
        item_to_add.setComplete(false);

        controller.getTdl().addItem(item_to_add);

        // Effectively returns to the main menu by the returnMain class method
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void ButtonReturnClicked(ActionEvent event) throws IOException {
        returnMain.returnToMainMenu(event);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ToDoListMainMenu.fxml"));
        Parent root;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ToDoListMainMenuController controller = loader.getController();

        String Name = controller.getTdl().getListName();
        chooseListAdd.getItems().addAll(Name);

        Items item = new Items();
         if(!(item.validFormat(DueDate.getText()))){
             ConfirmButton.setDisable(true);
         }
         }
        // For our chooseListAdd ListView Object
        // We have it get all the To-do list names from our master list Idk how to

        // The user types in an item name, notified with text if the itemName is invalid
        // The Confirm and Return buttons will also be greyed out / unclickable from this
        // The User will then click the confirm button
        // It will call a function to add that item to that list
        // After which, the user can continue inputting items or click Return to Main Menu
    }

