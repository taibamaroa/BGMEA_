package com.example.bgmea.bgmea_.protity;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Qualityinspectorgoal5 {

    @FXML
    private Label StatusLabel;

    @FXML
    private TextField batchIdField;

    @FXML
    private TableColumn<?, ?> colAction;

    @FXML
    private TableColumn<?, ?> colBatchId;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TextField cureectiveTF;

    @FXML
    private DatePicker datepicker;

    @FXML
    private TextArea reasonArea;

    @FXML
    private TableView<?> rejectedTable;

    @FXML
    void ReturnHomeBtn(ActionEvent event) {

    }

    @FXML
    void rejectdata(ActionEvent event) {

    }

}
