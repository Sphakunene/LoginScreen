package sample.controller;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

public class detailsController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label detailsWelcomeLabel;

    @FXML
    private Label detailsName;

    @FXML
    private Label detailsAge;

    @FXML
    private Label detailsProfession;

    @FXML
    private Hyperlink detailsWeb;

    @FXML
    private Hyperlink detailsTwitter;

    @FXML
    void initialize() {
    detailsWeb.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(Desktop.isDesktopSupported()){
                try {
                    Desktop.getDesktop().browse( new URI("https://www.linkedin.com"));
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        }
    });
    }

    void setName(String name, String profession, int age){
        detailsWelcomeLabel.setText("Welcome: "+ name);
        detailsName.setText("Name: "+ name);
        detailsAge.setText("age: "+age);
        detailsProfession.setText("Profession: "+profession);

    }
}
