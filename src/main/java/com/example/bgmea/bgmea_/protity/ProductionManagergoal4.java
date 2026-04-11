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


public class ProductionManagergoal4 {

    @FXML
    private TableColumn<ProductionManagerModelclass2, Integer> colDelayDays;

    @FXML
    private TableColumn<ProductionManagerModelclass2, String> colOrderId;

    @FXML
    private TableColumn<ProductionManagerModelclass1, String> colProduct;

    @FXML
    private TableColumn<ProductionManagerModelclass2, String> colStatus;

    @FXML
    private TextField daysTF;

    @FXML
    private TableView<ProductionManagerModelclass2> delayTable;

    @FXML
    private TextField orderidTF;

    @FXML
    private TextField productTF;

    @FXML
    private TextArea reasonArea;

    @FXML
    private Label statusLabel;

    static ArrayList<ProductionManagerModelclass2> list = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        colOrderId.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        colProduct.setCellValueFactory(new PropertyValueFactory<>("product"));
        colDelayDays.setCellValueFactory(new PropertyValueFactory<>("delayDays"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        delayTable.getItems().addAll(list);


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

    @FXML
    void UpdateDelayBtn(ActionEvent event) {
        String orderId = orderidTF.getText();
        String product = productTF.getText();
        String daysText = daysTF.getText();

        if (orderId.isEmpty() || product.isEmpty() || daysText.isEmpty()) {
            statusLabel.setText("Fill all fields!");
            return;
        }

        int days = Integer.parseInt(daysText);

        ProductionManagerModelclass2 data =
                new ProductionManagerModelclass2(orderId, product, days, "Delayed");

        delayTable.getItems().add(data);

        statusLabel.setText("Added to table!");
    }

}
