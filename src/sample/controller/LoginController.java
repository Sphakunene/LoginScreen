package sample.controller;

import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField loginUsername;

    @FXML


    private JFXPasswordField loginPassword;


    @FXML
    private JFXButton loginButton;

    @FXML
    void initialize() {
    loginButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override

        public void handle(ActionEvent event) {
            loginUser();
        }
    });

    }
    private void loginUser() {
        loginButton.getScene().getWindow().hide();

        if(!loginUsername.getText().trim().equals("") && !loginPassword.getText().trim().equals("") ){
            System.out.println("it went in");
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/details.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            detailsController controllerDetails = loader.getController();
            controllerDetails.setName(loginUsername.getText().trim().toString(),
                    "Java and App Developer", 50);
            stage.show();
            stage.setResizable(false);
        }
    }
}
