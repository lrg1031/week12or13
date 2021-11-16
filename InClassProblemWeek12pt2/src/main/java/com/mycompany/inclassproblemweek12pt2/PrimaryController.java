package com.mycompany.inclassproblemweek12pt2;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;
    @FXML
    private Button GCDButton;
    @FXML
    private Label answerLabel;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    public int getGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a-b;
            } else {
                b = b-a;
            }
        }
        return a;
    }
    
    public void computeGCD(ActionEvent event) {
    int a = Integer.parseInt(textField1.getText());
    int b = Integer.parseInt(textField2.getText());
    answerLabel.setText("The GCD is "+ getGCD(a, b));
    }

    @FXML
    private void getGCD(ActionEvent event) {
    }
}
