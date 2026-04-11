package com.example.bgmea.bgmea_.protity;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Qualityinspectorgoal2 {

    @FXML
    private TableColumn<QualityinspectorModelclass1, String> colBatch;

    @FXML
    private TableColumn<QualityinspectorModelclass1, String> colDefectId;

    @FXML
    private TableColumn<QualityinspectorModelclass1, Integer> colQuantity;

    @FXML
    private TableColumn<QualityinspectorModelclass1, String> colType;

    @FXML
    private TextField defectIdField;

    @FXML
    private TableView<QualityinspectorModelclass1> defectTable;

    @FXML
    private TextField defectTypeField;

    @FXML
    private Label msglabel;

    @FXML
    private TextField quantityField;

    static ArrayList<QualityinspectorModelclass1> list = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        colDefectId.setCellValueFactory(new PropertyValueFactory<>("defectId"));
        colType.setCellValueFactory(new PropertyValueFactory<>("defectType"));
        colQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        colBatch.setCellValueFactory(new PropertyValueFactory<>("batch"));

        defectTable.getItems().addAll(list);
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
    void savebtn(ActionEvent event) {String id = defectIdField.getText();
        String type = defectTypeField.getText();
        String qtyText = quantityField.getText();

        if (id.isEmpty() || type.isEmpty() || qtyText.isEmpty()) {
            msglabel.setText("Fill all fields!");
            return;
        }

        try {
            int quantity = Integer.parseInt(qtyText);
            String batch = "Batch1";

            QualityinspectorModelclass1 data =
                    new QualityinspectorModelclass1(id, type, quantity, batch);

            list.add(data);
            defectTable.getItems().add(data);

            msglabel.setText("Saved!");

            defectIdField.clear();
            defectTypeField.clear();
            quantityField.clear();

        } catch (NumberFormatException e) {
            msglabel.setText("Enter valid number!");
        }
    }

}