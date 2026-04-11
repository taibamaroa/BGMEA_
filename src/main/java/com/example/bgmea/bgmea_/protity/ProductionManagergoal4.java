package com.example.bgmea.bgmea_.protity;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import static com.example.bgmea.bgmea_.protity.ProductionManagergoal1.list;

public class ProductionManagergoal4 {

    @FXML
    private TableColumn<ProductionManagerModelclass2, Integer> colDelayDays;

    @FXML
    private TableColumn<ProductionManagerModelclass2, String> colOrderId;

    @FXML
    private TableColumn<ProductionManagerModelclass2, String> colProduct;

    @FXML
    private TableColumn<ProductionManagerModelclass2, String> colStatus;

    @FXML
    private TextField daysTF;

    @FXML
    private TableView<?> delayTable;

    @FXML
    private TextField orderidTF;

    @FXML
    private TextField productTF;

    @FXML
    private TextArea reasonArea;

    @FXML
    private Label statusLabel;
    

    @FXML
    void ReturnHomeBtn(ActionEvent event) {

    }

    @FXML
    void UpdateDelayBtn(ActionEvent event) {

    }

    @javafx.fxml.FXML
    public void initialize() {
        colOrderId.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        colProduct.setCellValueFactory(new PropertyValueFactory<>("product"));
        colDelayDays.setCellValueFactory(new PropertyValueFactory<>("delayDays"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        delayTable.getItems().addAll(list);


        }

    }
