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

public class HR1 {

    @FXML
    private DatePicker joiningDatePicker;

    @FXML
    private TextField nameField;

    @FXML
    private TextField nidField;

    @FXML
    private Label statusLabel;

    @FXML
    private TextField workerIdField;

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
        }
    }

    @FXML
    void submitBtn(ActionEvent event) {
        try {
            String name = nameField.getText();
            String nid = nidField.getText();
            String workerId = workerIdField.getText();
            var date = joiningDatePicker.getValue();

            if (name.isEmpty() || nid.isEmpty() || workerId.isEmpty() || date == null) {
                statusLabel.setText("Fill all fields!");
                return;
            }

            statusLabel.setText("Employee Added!");

            nameField.clear();
            nidField.clear();
            workerIdField.clear();
            joiningDatePicker.setValue(null);

        } catch (Exception e) {
            e.printStackTrace();
            statusLabel.setText("Error saving data!");
        }
    }
}