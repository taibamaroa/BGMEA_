package com.example.bgmea.bgmea_.protity;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;


public class ProductionManagergoal3 {

    @FXML
    private Label lastDateLabel;

    @FXML
    private ComboBox<String> machineBox;

    @FXML
    private DatePicker nextDatePicker;

    @FXML
    private Label statusLabel;



    @javafx.fxml.FXML
    public void initialize() {
        machineBox.getItems().addAll("Machine 1", "Machine 2", "Machine 3", "Machine 4");
    }

    @FXML
    void ReturnHome(ActionEvent actionEvent) throws IOException {

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
    void ScheduleBtn(ActionEvent event) {
        String machine = machineBox.getValue();
        LocalDate nextDate = nextDatePicker.getValue();

        if (machine == null || nextDate == null) {
            statusLabel.setText("Select machine and date first!");
            return;
        }

        lastDateLabel.setText("Next date: " + nextDate);
        statusLabel.setText("Scheduled successfully!");
    }


}
