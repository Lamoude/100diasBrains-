module com.example.dia4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dia4 to javafx.fxml;
    exports com.example.dia4;
}