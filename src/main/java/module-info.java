module com.example.media_proyect {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.media_proyect to javafx.fxml;
    opens com.example.media_proyect.models;
    opens com.example.media_proyect.db;
    exports com.example.media_proyect;
    exports com.example.media_proyect.models;
    exports com.example.media_proyect.db;
    exports com.example.media_proyect.controllers;
    opens com.example.media_proyect.controllers;


}