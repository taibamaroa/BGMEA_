package com.example.bgmea.bgmea_.Taiba;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Finance8 {

    @FXML
    private Label budgetLabel;

    @FXML
    private TableColumn<?, ?> colAmount;

    @FXML
    private TableColumn<?, ?> colEmployeeId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private ChoiceBox<?> departmentChoicebox;

    @FXML
    private TableView<?> salaryTable;
    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void Disbursebtn(ActionEvent event) {

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
