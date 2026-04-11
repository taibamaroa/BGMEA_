package com.example.bgmea.bgmea_.Taiba;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Finance7 {

    @FXML
    private ComboBox<?> monthBox;

    @FXML
    private Label taxLabel;

    @FXML
    private ComboBox<?> yearBox;
    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void CalculateTaxbtn(ActionEvent event) {

    }

    @FXML
    void Exportpdf(ActionEvent event) {

    }

    @FXML
    void returnBtn(ActionEvent actionEvent) throws IOException {

        try {
            Scene scene = ((Button) actionEvent.getSource()).getScene();
            Stage stage = (Stage) scene.getWindow();

            FXMLLoader scene2FxmlLoader = new FXMLLoader(FinanceDashboard.class.getResource("/com/example/bgmea/bgmea_/Taiba/FinanceDashboard.fxml"));
            Scene scene2 = new Scene(scene2FxmlLoader.load());
            stage.setScene(scene2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }}

}