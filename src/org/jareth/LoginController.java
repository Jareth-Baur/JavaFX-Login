/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package org.jareth;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jareth Baur
 */
public class LoginController implements Initializable {

    @FXML
    private TextField usernameField;
    @FXML
    private Button loginButton;
    @FXML
    private TextField passwordField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void loginButtonActionPerformed(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Login Success!");

            // Show the alert and wait for the user to close it
            alert.showAndWait();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("JavaFX Dashboard");
            primaryStage.setScene(scene);
            primaryStage.show();
        } else {
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText("Username/Password combination not found.");

            // Show the alert and wait for the user to close it
            alert.showAndWait();
        }
    }

}
