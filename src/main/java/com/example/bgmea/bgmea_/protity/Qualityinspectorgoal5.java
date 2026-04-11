package com.example.bgmea.bgmea_.protity;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class Qualityinspectorgoal5 {

    @FXML
    private Label StatusLabel;

    @FXML
    private TextField batchIdField;

    @FXML
    private TableColumn<QualityinspectorModelclass3, String> colAction;

    @FXML
    private TableColumn<QualityinspectorModelclass3, String> colBatchId;

    @FXML
    private TableColumn<QualityinspectorModelclass3, String> colDate;

    @FXML
    private TableColumn<QualityinspectorModelclass3, String> colStatus;

    @FXML
    private TextField cureectiveTF;

    @FXML
    private DatePicker datepicker;

    @FXML
    private TextArea reasonArea;

    @FXML
    private TableView<QualityinspectorModelclass3> rejectedTable;

    static ArrayList<QualityinspectorModelclass3> list = new ArrayList<>();
    @FXML
    private TextField cureectiveTF;
    @FXML
    private DatePicker datepicker;
    @FXML
    private TextField batchIdField;

    @javafx.fxml.FXML
    public void initialize() {
        colBatchId.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        colAction.setCellValueFactory(new PropertyValueFactory<>("action"));

        rejectedTable.getItems().addAll(list);

        @FXML
        void ReturnHomeBtn (ActionEvent event){

        }

        @FXML
        void rejectdata (ActionEvent event){

        }

    }}
