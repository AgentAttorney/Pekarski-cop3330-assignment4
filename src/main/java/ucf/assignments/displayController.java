package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class displayController implements Initializable {
    @FXML private ChoiceBox chooseListName;
    @FXML private CheckBox Complete;
    @FXML private CheckBox Incomplete;
    @FXML private Button ConfirmButton;
    @FXML private javafx.scene.control.ListView<Items> ListView;
    public void BackButtonClicked(ActionEvent event) throws IOException {
        // call the returnToMainMenu method from the associated class
        returnMain.returnToMainMenu(event);
        // returns to previous menu
    }
    public void ButtonConfirmClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ToDoListMainMenu.fxml"));
        Parent root = loader.load();
        ToDoListMainMenuController controller = loader.getController();

       // if((Complete.isSelected() || Incomplete.isSelected())&& )
        if(Complete.isSelected()){
            // append Items with true 'Complete' value to items to display
        }

        if(Incomplete.isSelected()){
            // append Items with false 'Complete' value to items to display
        }
        // Displays / Prints all items of chosen List
    }
    public void ButtonReturnClicked(ActionEvent event) throws IOException {
        // Returns to the main menu using returnMain class's method
        returnMain.returnToMainMenu(event);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ToDoListMainMenu.fxml"));
        try {
            Parent root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ToDoListMainMenuController controller = loader.getController();
        ListView.getItems().addAll(controller.getTdl().getObv_list());
    }
}
