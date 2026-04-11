package com.example.bgmea.bgmea_.protity;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class Qualityinspectorgoal3 {

    @FXML
    private TableView<QualityinspectorModelclass2> batchTable;

    @FXML
    private TableColumn<QualityinspectorModelclass2, String> colBatchId;

    @FXML
    private TableColumn<QualityinspectorModelclass2, String> colResult;

    @FXML
    private TableColumn<QualityinspectorModelclass2, String> colStatus;

    @FXML
    private ComboBox<String> decisionBox;

    @FXML
    private Label messageLabel;
    @FXML
    private TableColumn <QualityinspectorModelclass2, String>colname;

    static ArrayList<QualityinspectorModelclass2> list = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        colBatchId.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        colname.setCellValueFactory(new PropertyValueFactory<>("name"));
        colResult.setCellValueFactory(new PropertyValueFactory<>("date"));
        decisionBox.getItems().addAll("Approved", "Rejected");

    }

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
    @FXML
    void UpdateStatusBtn(ActionEvent event) {
    }

}