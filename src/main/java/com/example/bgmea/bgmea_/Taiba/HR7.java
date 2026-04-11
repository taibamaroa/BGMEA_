package com.example.bgmea.bgmea_.Taiba;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HR7 {

    @FXML
    private TableView<?> attendanceTable;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField factoryIdField;

    @FXML
    private Label statusLabel;

    @FXML
    void fetchBtn(ActionEvent event) {

    }

    @FXML
    void returnBtn(ActionEvent event) {

    }

}
