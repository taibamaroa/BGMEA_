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

public class ProductionManagergoal2 {

    @FXML
    private TableView<ProductionManagerModelclass1> assignmentTable;

    @FXML
    private TableColumn<ProductionManagerModelclass1, String> colLine;

    @FXML
    private TableColumn<ProductionManagerModelclass1, Integer> colWorkers;

    @FXML
    private TableColumn<ProductionManagerModelclass1, String> colStatus;

    @FXML
    private Label msglabel;

    static ArrayList<ProductionManagerModelclass1> list = new ArrayList<>();

    @FXML
    public void initialize() {
        colLine.setCellValueFactory(new PropertyValueFactory<>("line"));
        colWorkers.setCellValueFactory(new PropertyValueFactory<>("workers"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        assignmentTable.getItems().addAll(list);


    }

    @FXML
    void AssignWorkersBtn(ActionEvent event) {
         }


    @FXML
    void ReturnHomeBtn(ActionEvent actionEvent) throws IOException {

        try {
            Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(
                    ProductionManagerDashboard.class.getResource(
                            "/com/example/bgmea/bgmea_/protity/ProductionManagerDashboard.fxml"
                    )
            );
            stage.setScene(new Scene(loader.load()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}