package com.example.bgmea.bgmea_.Taiba;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HR2 {

    @FXML
    private TextField LocationfD;

    @FXML
    private TextArea auditArea;

    @FXML
    private TableView<HRModelclass2> auditTable;

    @FXML
    private TableColumn<HRModelclass2, String> colFindings;

    @FXML
    private TableColumn<HRModelclass2, String> colId;

    @FXML
    private TableColumn<HRModelclass2, String> colName;

    @FXML
    private TextField factoryIdField;

    @FXML
    private TextField factorynmField;

    @FXML
    private Label statusLabel;

    ArrayList<HRModelclass2> list = new ArrayList<>();

    @FXML
    public void initialize() {
        colId.setCellValueFactory(new PropertyValueFactory<>("factoryId"));
        colName.setCellValueFactory(new PropertyValueFactory<>("factoryName"));
        colFindings.setCellValueFactory(new PropertyValueFactory<>("findings"));

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
    @FXML
    void saveBtn(ActionEvent event) {

        String id = factoryIdField.getText();
        String name = factorynmField.getText();
        String findings = auditArea.getText();
        String location = LocationfD.getText();

        if (id.isEmpty() || name.isEmpty() || findings.isEmpty() || location.isEmpty()) {
            statusLabel.setText("Please fill all fields.");
            return;
        }

        HRModelclass2 obj =
                new HRModelclass2(id, name, findings, location);

        list.add(obj);
        auditTable.getItems().add(obj);

        statusLabel.setText("Saved!");

        factoryIdField.clear();
        factorynmField.clear();
        auditArea.clear();
        LocationfD.clear();
    }
    @FXML
    void searchBtn(ActionEvent event) {
        statusLabel.setText("Loaded data!");

    }

}