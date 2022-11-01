module com.example.ceasarcyphergui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ceasarcyphergui to javafx.fxml;
    exports com.example.ceasarcyphergui;
}