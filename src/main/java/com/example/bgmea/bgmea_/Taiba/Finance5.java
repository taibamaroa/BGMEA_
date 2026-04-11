package com.example.bgmea.bgmea_.Taiba;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Finance5 {

    @FXML
    private TextField amountField;

    @FXML
    private TextArea descriptiontextArea;

    @FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void PostLedgerbtn(ActionEvent event) {

        String amountText = amountField.getText();
        String desc = descriptiontextArea.getText();

        if (amountText.isEmpty() || desc.isEmpty()) {
            statusLabel.setText("Fill all fields!");
            return;
        }

        double amount = Double.parseDouble(amountText);

        statusLabel.setText("Ledger Posted!");

        amountField.clear();
        descriptiontextArea.clear();
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