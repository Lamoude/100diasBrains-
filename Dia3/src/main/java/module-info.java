module com.example.dia3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dia3 to javafx.fxml;
    exports com.example.dia3;
}