package com.example.bgmea.bgmea_.Taiba;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Finance1 {

    @FXML
    private TableColumn<FinanceModelclass1,Double > colAmount;

    @FXML
    private TableColumn<FinanceModelclass1, LocalDate> colDate;

    @FXML
    private TableColumn<FinanceModelclass1, String> colFactoryId;

    @FXML
    private TextField factoryIdField;

    @FXML
    private TextField paymentField;

    @FXML
    private TableView<FinanceModelclass1> paymentTable;

    @FXML
    private Label statuslabel;


    @FXML
    private TextField duesTF;
    @FXML
    private TableColumn <FinanceModelclass1,Double >Coldues;
    @FXML
    private DatePicker datepicker;

    ArrayList<FinanceModelclass1> list = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        colFactoryId.setCellValueFactory(new PropertyValueFactory<>("factoryId"));
        colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        Coldues.setCellValueFactory(new PropertyValueFactory<>("dues"));

    }
    @FXML
    void ConfirmPaymentbtn(ActionEvent event) {

        String factoryId = factoryIdField.getText();
        String paymentText = paymentField.getText();
        String duesText = duesTF.getText();
        LocalDate date = datepicker.getValue();

        if (factoryId.isEmpty() || paymentText.isEmpty() || duesText.isEmpty() || date == null) {
            statuslabel.setText("Please fill all fields.");
            return;
        }

        try {
            double amount = Double.parseDouble(paymentText);
            double dues = Double.parseDouble(duesText);

            FinanceModelclass1 payment =
                    new FinanceModelclass1(factoryId, amount, dues, date);

            list.add(payment);
            paymentTable.getItems().add(payment);


            statuslabel.setText("Saved successfully!");
            factoryIdField.clear();
            paymentField.clear();
            duesTF.clear();

            datepicker.setValue(null);

        } catch (NumberFormatException e) {
            statuslabel.setText("Enter valid numbers!");
        }
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

}