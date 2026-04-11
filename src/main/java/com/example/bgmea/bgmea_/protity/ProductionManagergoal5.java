package com.example.bgmea.bgmea_.protity;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ProductionManagergoal5 {

    @FXML
    private TextField NameTF;

    @FXML
    private TableColumn<ProductionManagerModelclass3, String> colAvailable;

    @FXML
    private TableColumn<ProductionManagerModelclass3, String> colId;

    @FXML
    private TableColumn<ProductionManagerModelclass3, String> colName;

    @FXML
    private TableColumn<ProductionManagerModelclass3, String> colSkill;

    @FXML
    private ComboBox<String> departmentBox;

    @FXML
    private TextField idTF;

    @FXML
    private Label statusLabel;

    @FXML
    private TableView<?> workerTable;
    @FXML
    private ToggleGroup availabilityGroup;
    @FXML
    private ToggleGroup shiftGroup;

    @FXML
    void AssignShiftBtn(ActionEvent event) {

    }

    @FXML
    void ReturnHomeBtn(ActionEvent event) {

    }

    @FXML
    void saveBtn(ActionEvent event) {

    }

}
