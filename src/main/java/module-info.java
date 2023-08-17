module com.example.triangleareacalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.triangleareacalculator to javafx.fxml;
    exports com.example.triangleareacalculator;
}