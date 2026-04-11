package com.example.bgmea.bgmea_.Taiba;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Finance2 {

    @FXML
    private TableColumn<FinanceModelclass1, Double> colAmount;

    @FXML
    private TableColumn<FinanceModelclass1, LocalDate> colDate;

    @FXML
    private TableColumn<FinanceModelclass1, String> colFactoryId;

    @FXML
    private TableColumn<FinanceModelclass1, String> colStatus;

    @FXML
    private TableView<FinanceModelclass1> pendingTable;


    ArrayList<FinanceModelclass1> list = new ArrayList<>();
    @FXML
    private Label msglabel;
    @FXML
    private TextField transIdField;

    @javafx.fxml.FXML
    public void initialize() {

        colFactoryId.setCellValueFactory(new PropertyValueFactory<>("factoryId"));
        colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @FXML
    void ApproveFeebtn(ActionEvent event) {
        FinanceModelclass1 selected =
                pendingTable.getSelectionModel().getSelectedItem();

        String transId = transIdField.getText();

        if (selected == null || transId.isEmpty()) {
            msglabel.setText("Select row & enter Transaction ID!");
            return;
        }
        pendingTable.refresh();

        msglabel.setText("Payment Approved!");

        transIdField.clear();
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

    @FXML
    public void loadinfobtn(ActionEvent actionEvent) {
        File f = new File("Finance.bin");

        FileInputStream fis;
        ObjectInputStream ois;

        try {
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            pendingTable.getItems().clear();
            list.clear();

            while (true) {
                try {
                    FinanceModelclass1 s = (FinanceModelclass1) ois.readObject();
                    list.add(s);
                    pendingTable.getItems().add(s);
                } catch (EOFException e) {
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }}