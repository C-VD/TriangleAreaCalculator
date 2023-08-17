package com.example.triangleareacalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.List;

public class HelloController {
    @FXML
    private TextArea txtFileName;
    @FXML
    private Label labLog;
    @FXML
    protected void onLoadBtnClick()
    {
        List<String> trianglesList = Triangles.loadFromFile();

    }
    @FXML
    protected void onSaveBtnClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}