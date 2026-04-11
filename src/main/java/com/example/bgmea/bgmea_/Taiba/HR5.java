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

public class HR5 {

    @FXML
    private TextField DepertmentTF;

    @FXML
    private TableColumn<HRModelclass3, String> colDept;

    @FXML
    private TableColumn<HRModelclass3, String> colId;

    @FXML
    private TableColumn<HRModelclass3, String> colName;

    @FXML
    private TextField nameTF;

    @FXML
    private Label previewLabel;

    @FXML
    private Label statusLabel;

    @FXML
    private TableView<HRModelclass3> workerTable;

    @FXML
    private TextField workeridTF;

    ArrayList<HRModelclass3> list = new ArrayList<>();

    @FXML
    public void initialize() {

        colId.setCellValueFactory(new PropertyValueFactory<>("workerId"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colDept.setCellValueFactory(new PropertyValueFactory<>("department"));
    }

    @FXML
    void generateBtn(ActionEvent event) {

        String id = workeridTF.getText();
        String name = nameTF.getText();
        String dept = DepertmentTF.getText();

        if (id.isEmpty() || name.isEmpty() || dept.isEmpty()) {
            statusLabel.setText("Fill all fields!");
            return;
        }

        HRModelclass3 obj = new HRModelclass3(id, name, dept);

        list.add(obj);
        workerTable.getItems().add(obj);

        previewLabel.setText("ID: " + id + ", Name: " + name + ", Dept: " + dept);

        statusLabel.setText("Generated!");

        workeridTF.clear();
        nameTF.clear();
        DepertmentTF.clear();
    }

    @FXML
    void returnBtn(ActionEvent actionEvent) throws IOException {

        try {
            Scene scene = ((Button) actionEvent.getSource()).getScene();
            Stage stage = (Stage) scene.getWindow();

            FXMLLoader loader = new FXMLLoader(HRDashboard.class.getResource("/com/example/bgmea/bgmea_/Taiba/HRDashboard.fxml"));
            Scene scene2 = new Scene(loader.load());
            stage.setScene(scene2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}