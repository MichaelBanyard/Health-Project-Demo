package healthprojectdemo.controllers;

import healthprojectdemo.HealthApplication;
import healthprojectdemo.util.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.HashMap;

public class SignInController {
    @FXML
    public Button submitButton;

    @FXML
    public Button registerButton;

    @FXML
    public TextField usernameField;

    @FXML
    public PasswordField passwordField;

    static HashMap<String, User> users = HealthApplication.users;

    public SignInController(){

    }

    @FXML
    public void onSubmit(ActionEvent event) {
        attemptSignIn(usernameField.getText(), passwordField.getText());
    }

    public static void attemptSignIn(String username, String password){
        if(users.containsKey(username)){
            System.out.println("Account exists!");
            if(users.get(username).password.equals(password)){
                System.out.println("Correct password!");
            }
            else{
                System.out.println("Incorrect password!");
            }
        } else{
            System.out.println("Account doesn't exist!");
        }
    }

    @FXML
    public void onRegister(ActionEvent event) {
        addAccount(usernameField.getText(), passwordField.getText());
    }

    public static void addAccount(String username, String password) {
        if(!users.containsKey(username)){
            users.put(username, new User(password));
            System.out.println("Account created!");
        } else{
            System.out.println("Account already exists!");
        }
    }
}
















