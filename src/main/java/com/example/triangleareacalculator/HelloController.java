package com.example.triangleareacalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.List;

public class HelloController {
    @FXML
    private TextField txtFileName;
    @FXML
    private Label labLog;
    @FXML
    private VBox rightVBox;
    private TextField txtA;
    private TextField txtB;
    private TextField txtC;
    @FXML
    void addTriangle(){
        HBox hb = new HBox();
        TextField a = new TextField();
        a.setText(txtA.getText());
        hb.getChildren().add(a);
        TextField b = new TextField();
        b.setText(txtB.getText());
        hb.getChildren().add(b);
        TextField c = new TextField();
        c.setText(txtC.getText());
        hb.getChildren().add(c);
        Button del = new Button("Remove");
        del.setOnAction(ActionEvent -> rightVBox.getChildren().remove(hb));
        hb.getChildren().add(del);
        rightVBox.getChildren().add(hb);
    }
    @FXML
    protected void onAddBtnClick()
    {
        addTriangle();
    }
    @FXML
    protected void onLoadBtnClick()
    {
        List<String> trianglesList = Triangles.loadFromFile(txtFileName.getText());
        if (trianglesList == null) {
            logPrint("Error");
            return;
        }
        for (int i = 0; i < trianglesList.size(); i++) {
            logPrint(trianglesList.get(i));
        }

    }
    @FXML
    protected void onSaveBtnClick() {

    }
    void logPrint(String s){
        labLog.setText(labLog.getText() + s + "\n");

    }
}