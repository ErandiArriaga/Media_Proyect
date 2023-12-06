package com.example.media_proyect.controllers;

import com.example.media_proyect.HelloApplication;
import com.example.media_proyect.db.LoginDAO;
import com.example.media_proyect.db.MySQLConnection;
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

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

public class Login implements Initializable, EventHandler {

    @FXML
    ImageView skzflix;
    @FXML
    Button btnLogin, btnSub, btnCancel;
    @FXML
    TextField txtPassword, txtUser;
    Connection conn = MySQLConnection.getConnection();
    LoginDAO userDAO = new LoginDAO(conn);

    @Override
    public void handle(Event event) {
        System.out.println("HOLA HOLA");

        if(event.getSource()==btnLogin)
        {
            System.out.println("HOLA MUNDO");
            String user = userDAO.getUser(txtUser.getText(),txtPassword.getText());
            switch(user){
                case "Premium":
                    createWindow("InterfaceP", 750,600);
                    closeWindow();
                    break;
                case "New":
                    createWindow("NewPay",700,600);
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
        System.out.println("HOLA");
        //Image image = new Image(getClass().getResource("/images/skzflix.jpg").toString());
        //skzflix.setImage(image);
        btnLogin.setOnAction(this);
        btnSub.setOnAction(this);
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
