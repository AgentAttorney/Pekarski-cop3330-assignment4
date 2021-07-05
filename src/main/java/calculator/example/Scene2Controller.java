package calculator.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene2Controller {
    public void BackToMainMenuClicked(ActionEvent actionEvent) throws IOException {
        Parent backSceneParent = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
        Scene backScene = new Scene(backSceneParent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(backScene);
        window.show();
    }
}
