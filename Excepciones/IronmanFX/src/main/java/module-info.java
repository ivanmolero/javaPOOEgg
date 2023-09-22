module com.example.ironmanfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ironmanfx to javafx.fxml;
    exports com.example.ironmanfx;
}