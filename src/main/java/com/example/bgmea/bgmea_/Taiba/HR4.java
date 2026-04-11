package com.example.bgmea.bgmea_.Taiba;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HR4 {

    @FXML
    private DatePicker caseDatePicker;

    @FXML
    private TextField caseid;

    @FXML
    private TextField nameField;

    @FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void opencaseBtn(ActionEvent event) {

        String caseId = caseid.getText();
        String name = nameField.getText();
        var date = caseDatePicker.getValue();

        if (caseId.isEmpty() || name.isEmpty() || date == null) {
            statusLabel.setText("Fill all fields!");
            return;
        }

        statusLabel.setText("Case Opened!");

        caseid.clear();
        nameField.clear();
        caseDatePicker.setValue(null);
    }

    @FXML
    void returnBtn(ActionEvent actionEvent) throws IOException {

        try {
            Scene scene = ((Button) actionEvent.getSource()).getScene();
            Stage stage = (Stage) scene.getWindow();

            FXMLLoader scene2FxmlLoader = new FXMLLoader(HRDashboard.class.getResource("/com/example/bgmea/bgmea_/Taiba/HRDashboard.fxml"));
            Scene scene2 = new Scene(scene2FxmlLoader.load());
            stage.setScene(scene2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }}

}