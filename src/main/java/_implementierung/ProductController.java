package _implementierung;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ProductController{


    @FXML
    private Label home;

    @FXML
    private Label kuecheLabel;

    @FXML
    private Label carlabel;

    @FXML
    private Label pflegelabel;

    @FXML
    private Label gadgetslabel;

    @FXML
    private Label warenkorb;

    @FXML
    private Button warenkorb_button;

    @FXML
    private Label login;

    @FXML
    public void initialize() {
        kuecheLabel.setOnMouseClicked(this::handleKuecheClick);
        carlabel.setOnMouseClicked(this::handleCarClick);
        pflegelabel.setOnMouseClicked(this::handlePflegeClick);
        home.setOnMouseClicked(this::handleHomeClick);
        gadgetslabel.setOnMouseClicked(this::handleGadgetsClick);
        warenkorb.setOnMouseClicked(this::handleWarenkorbClick);
        warenkorb_button.setOnMouseClicked(this::handleWarenkorbClick);
        login.setOnMouseClicked(this::handleLoginClick);
        login.textProperty().bind(UserManager.getInstance().userTextProperty());
    }



    private void handleLoginClick(MouseEvent event) {
        try {
            // Lade second.fxml
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
            Scene loginScene = new Scene(fxmlLoader.load());

            // Hole die aktuelle Stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Setze die neue Scene
            stage.setScene(loginScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleWarenkorbClick(MouseEvent event) {
        try {
            // Lade second.fxml
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("six.fxml"));
            Scene sixScene = new Scene(fxmlLoader.load());

            // Hole die aktuelle Stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Setze die neue Scene
            stage.setScene(sixScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void handleGadgetsClick(MouseEvent event) {
        try {
            // Lade second.fxml
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fifth.fxml"));
            Scene fifthScene = new Scene(fxmlLoader.load());

            // Hole die aktuelle Stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Setze die neue Scene
            stage.setScene(fifthScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void handlePflegeClick(MouseEvent event) {
        try {
            // Lade second.fxml
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fourth.fxml"));
            Scene fourthScene = new Scene(fxmlLoader.load());

            // Hole die aktuelle Stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Setze die neue Scene
            stage.setScene(fourthScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void handleCarClick(MouseEvent event) {
        try {
            // Lade second.fxml
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("third.fxml"));
            Scene firthScene = new Scene(fxmlLoader.load());

            // Hole die aktuelle Stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Setze die neue Scene
            stage.setScene(firthScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    private void handleHomeClick(MouseEvent event) {
        try {
            // Lade second.fxml
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("primary.fxml"));
            Scene primaryScene = new Scene(fxmlLoader.load());

            // Hole die aktuelle Stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Setze die neue Scene
            stage.setScene(primaryScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleKuecheClick(MouseEvent event) {
        try {
            // Lade second.fxml
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("second.fxml"));
            Scene secondScene = new Scene(fxmlLoader.load());

            // Hole die aktuelle Stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Setze die neue Scene
            stage.setScene(secondScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}