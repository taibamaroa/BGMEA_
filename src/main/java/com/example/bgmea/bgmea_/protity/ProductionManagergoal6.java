package com.example.bgmea.bgmea_.protity;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import static com.example.bgmea.bgmea_.protity.ProductionManagergoal1.list;

public class ProductionManagergoal6 {

    @FXML
    private TextField batchTF;

    @FXML
    private TableView<ProductionManagerModelclass4> batchTable;

    @FXML
    private TableColumn<ProductionManagerModelclass4,String> colBatchId;

    @FXML
    private TableColumn<ProductionManagerModelclass4,String> colProduct;

    @FXML
    private TableColumn<ProductionManagerModelclass4,String> colStatus;

    @FXML
    private Label confirmationLabel;

    @FXML
    private TextField producTf;

    @javafx.fxml.FXML
    public void initialize() {
        colBatchId.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        colProduct.setCellValueFactory(new PropertyValueFactory<>("product"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        batchTable.getItems().addAll(list);

    @FXML
    void ReturnHomeBtn(ActionEvent event) {

    }

    @FXML
    void adddatatoSendRequest(ActionEvent event) {

    }

}
