module com.example.bordro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bordro to javafx.fxml;
    exports com.example.bordro;
}