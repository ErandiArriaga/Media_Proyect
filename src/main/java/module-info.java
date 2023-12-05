module com.example.media_proyect {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.media_proyect to javafx.fxml;
    exports com.example.media_proyect;
}