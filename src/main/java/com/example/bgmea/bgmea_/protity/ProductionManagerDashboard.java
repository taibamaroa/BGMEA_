package com.example.bgmea.bgmea_.protity;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ProductionManagerDashboard {
    @javafx.fxml.FXML
    public void user6Goal7(ActionEvent actionEvent) {

        try {
            Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(
                    ProductionManagerDashboard.class.getResource(
                            "/com/example/bgmea/bgmea_/protity/ProductionManagergoal7.fxml"
                    )
            );
            stage.setScene(new Scene(loader.load()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void user6Goal6(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LogoutBtn(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(
                    ProductionManagerDashboard.class.getResource(
                            "/com/example/bgmea/bgmea_/Login.fxml"
                    )
            );
            stage.setScene(new Scene(loader.load()));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @javafx.fxml.FXML
    public void user6Goal8(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void user6Goal3(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void user6Goal2(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void user6Goal5(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void user6Goal4(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void user6Goal1(ActionEvent actionEvent) {
    }
}
