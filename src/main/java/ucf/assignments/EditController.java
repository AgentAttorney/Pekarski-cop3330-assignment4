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
    public void ButtonListClicked(ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"EditList.FXML");
        // call the SceneManager class with our FXML Name

    }
    public void ButtonItemClicked(ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"EditItem.FXML");
        // call the SceneManager class with our FXML Name
    }
}
