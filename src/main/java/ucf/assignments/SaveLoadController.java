package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.event.ActionEvent;

import java.io.IOException;

public class SaveLoadController {
    public void ButtonBackMMClicked(ActionEvent event) throws IOException {
        // call returnMain class's associated method to return to main menu
        returnMain.returnToMainMenu(event);
        // consistent since it goes back submenu
    }
    public void ButtonSaveClicked(ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"SaveExternalList.FXML");
        // call the SceneManager class with our FXML Name

    }
    public void ButtonLoadClicked(ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"LoadExternalList.FXML");
        // call the SceneManager class with our FXML Name
    }
}
