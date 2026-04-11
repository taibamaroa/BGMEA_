package com.example.bgmea.bgmea_.protity;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class ProductionManagergoal3 {

    @FXML
    private Label lastDateLabel;

    @FXML
    private ComboBox<String> machineBox;

    @FXML
    private DatePicker nextDatePicker;

    @FXML
    private Label statusLabel;

    @FXML
    void ReturnHome(ActionEvent event) {

    }

    @FXML
    void ScheduleBtn(ActionEvent event) {

    }
    @javafx.fxml.FXML
    public void initialize() {
        machineBox.getItems().addAll("Machine 1", "Machine 2", "Machine 3", "Machine 4");
    }

    }
}
