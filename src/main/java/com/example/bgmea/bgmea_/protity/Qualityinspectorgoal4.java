package com.example.bgmea.bgmea_.protity;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Qualityinspectorgoal4 {

    @FXML
    private DatePicker fromDate;

    @FXML
    private TextArea reportArea;

    @FXML
    private ChoiceBox<String> reportTypeChoicebox;

    @FXML
    private DatePicker toDate;
    @FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        reportTypeChoicebox.getItems().addAll("Daily", "Weekly", "Monthly");

    }
    @FXML
    void GenerateReportBtn(ActionEvent event) {
        if (fromDate.getValue() == null || toDate.getValue() == null) {
            statusLabel.setText("Select dates first!");
            return;
        }

        reportArea.setText(
                "Report generated from " + fromDate.getValue() +
                        " to " + toDate.getValue()
        );

        statusLabel.setText("Done!"); }

    @FXML
    void ReturnHomeBtn(ActionEvent actionEvent) throws IOException {

        try {
            Scene scene = ((Button) actionEvent.getSource()).getScene();
            Stage stage = (Stage) scene.getWindow();

            FXMLLoader scene2FxmlLoader = new FXMLLoader(QualityinspectorDashboard.class.getResource("/com/example/bgmea/Shahtaz/QualityinspectorDashboard.fxml"));
            Scene scene2 = new Scene(scene2FxmlLoader.load());
            stage.setScene(scene2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }}

}