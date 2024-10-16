package com.example.cshomework20241016;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private TextField age;
    @FXML
    private TextField name;

    @FXML
    private TextField color;
    @FXML
    private Label welcomeText;
    @FXML
    private Pane background;

    @FXML
    protected void onSubmit() {
        welcomeText.setText("Hello " + name.getText() + ", you are " + age.getText() + " years old!");
        background.setStyle("-fx-background-color:" + color.getText());

    };
}