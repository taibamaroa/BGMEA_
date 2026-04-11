package com.example.bgmea.bgmea_.Taiba;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class Finance4 {

    @FXML
    private DatePicker auditDatepic;

    @FXML
    private ChoiceBox<String> factoryChoicebox;

    @FXML
    private TextArea invoicetextArea;
    @FXML
    public void initialize() {
        factoryChoicebox.getItems().addAll("Factory A", "Factory B", "Factory C");
    }
    @FXML
    void RecordFeebtn(ActionEvent event) {

        if (factoryChoicebox.getValue() == null || auditDatepic.getValue() == null) {
            invoicetextArea.setText("Fill all fields!");
            return;
        }

        invoicetextArea.setText("Recorded!");
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