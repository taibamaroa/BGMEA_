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

public class Finance3 {

    @FXML
    private TextField bankField;

    @FXML
    private TableView<FinanceModelclass2> claimsTable;

    @FXML
    private TextField cliamidTF;

    @FXML
    private TableColumn<FinanceModelclass2, String> colAmount;

    @FXML
    private TableColumn<FinanceModelclass2, String> colClaimId;

    @FXML
    private TableColumn<FinanceModelclass2, String> colStatus;

    @FXML
    private Label statuslabel;

    ArrayList<FinanceModelclass2> list = new ArrayList<>();
    @FXML
    private TextField amountTF;

    @FXML
    public void initialize() {

        colClaimId.setCellValueFactory(new PropertyValueFactory<>("claimId"));
        colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        claimsTable.getItems().addAll(list);
    }
    @FXML
    void executeTransferbtn(ActionEvent event) {

        String claimId = cliamidTF.getText();
        String bank = bankField.getText();
        String amountText = amountTF.getText();

        if (claimId.isEmpty() || bank.isEmpty() || amountText.isEmpty()) {
            statuslabel.setText("Please fill all fields.");
            return;
        }

        double amount = Double.parseDouble(amountText);

        FinanceModelclass2 obj =
                new FinanceModelclass2(claimId, amount, "Transferred", bank);

        list.add(obj);
        claimsTable.getItems().add(obj);

        statuslabel.setText("Transfer added.");

        cliamidTF.clear();
        bankField.clear();
        amountTF.clear();
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