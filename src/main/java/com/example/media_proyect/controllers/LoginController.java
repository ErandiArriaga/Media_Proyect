package com.example.media_proyect.controllers;

import com.example.media_proyect.HelloApplication;
import com.example.media_proyect.db.LoginDAO;
import com.example.media_proyect.db.MySQLConnection;
import com.example.media_proyect.models.Login;
import com.example.media_proyect.models.Usuarios;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginController implements Initializable, EventHandler {

    @FXML
    ImageView skzflix;
    @FXML
    Button btnLogin, btnSub, btnCancel;
    @FXML
    TextField txtPassword, txtUser;
    Connection conn = MySQLConnection.getConnection();
    LoginDAO loginDAO = new LoginDAO();

    @Override
    public void handle(Event event) {
        if(event.getSource()==btnLogin)
        {
            if (txtPassword.getText().trim().isEmpty() || txtUser.getText().trim().isEmpty()) {
                // aqui el código no compila pq falta el usuario o la contraseña
                return;
            }
            Login user = null;
            try {
                user = loginDAO.login(txtUser.getText());
                if (user == null) {
                    // aqui no se ha encontrado el usuario
                    return;
                }
                // aqui si se ha encontrado
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            switch(user.getMembresia()){
                case "premium":
                    createWindow("interfaz", 750,600);
                    closeWindow();
                    break;
                case "basico":
                    createWindow("interfaz",700,600);
                    closeWindow();
                    break;
                default:
                    System.out.println("Incorrect");
            }

        }else if((Button) event.getSource()==btnCancel)
        {
            System.exit(0);
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Image image = new Image(Objects.requireNonNull(this.getClass().getClassLoader().getResource("images/skzflix.jpg")).toString());
        Image image = new Image(new File("src/main/java/com/example/media_proyect/imagenes/skzflix.jpg").toURI().toString());
        skzflix.setImage(image);
        btnLogin.setOnAction(this);
        btnSub.setOnAction(this);
    }

    private Image loadImageFromResource(String path) {
        // Obtener el InputStream de la imagen desde resources
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path);

        if (inputStream != null) {
            // Crear la imagen desde el InputStream
            return new Image(inputStream);
        } else {
            System.out.println("No se pudo cargar la imagen desde resources: " + path);
            return null;
        }
    }

    private void closeWindow() {
        Stage stage = (Stage) btnLogin.getScene().getWindow();
        stage.close();
    }

    private void createWindow(String file, int width, int height) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(file + ".fxml"));

        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), width, height);
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.setScene(scene);
        stage.show();
    }

}
