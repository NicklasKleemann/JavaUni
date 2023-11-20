package com.example.templateloginprogram;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RegisterController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField repeatPasswordField;
    @FXML
    public void registerUser() throws IOException{
        System.out.println("Register successful!");
        backToLogin();
    }
    @FXML
    public void backToLogin() throws IOException {
        LoginTemplateApplication.setRoot("hello-view");
    }

}
