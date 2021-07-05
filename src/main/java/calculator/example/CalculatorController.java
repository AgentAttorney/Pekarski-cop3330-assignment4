package calculator.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorController {
    public void Button1Clicked(ActionEvent actionEvent) {
    }

    public void Button2Clicked(ActionEvent actionEvent) {
    }

    public void Button3Clicked(ActionEvent actionEvent) {
    }

    public void Button4Clicked(ActionEvent actionEvent) {
    }

    public void Button5Clicked(ActionEvent actionEvent) {
    }

    public void Button6Clicked(ActionEvent actionEvent) {
    }

    public void Button7Clicked(ActionEvent actionEvent) {
    }

    public void Button8Clicked(ActionEvent actionEvent) {
    }

    public void Button9Clicked(ActionEvent actionEvent) {
    }

    public void StartButtonClicked(ActionEvent actionEvent) {
    }

    public void Button0Clicked(ActionEvent actionEvent) {
    }

    public void InverseSignButtonClicked(ActionEvent actionEvent) {
    }

    public void EqualsSignButtonClicked(ActionEvent actionEvent) {
    }

    public void DivideButtonClicked(ActionEvent actionEvent) {
    }

    public void MultiplyButtonClicked(ActionEvent actionEvent) {
    }

    public void SubtractButtonClicked(ActionEvent actionEvent) {
    }

    public void AddButtonClicked(ActionEvent actionEvent) {
    }

    public void BackButtonClicked(ActionEvent actionEvent) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        Scene scene2 = new Scene(scene2Parent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
}
