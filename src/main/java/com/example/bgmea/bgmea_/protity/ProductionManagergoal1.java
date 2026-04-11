package com.example.bgmea.bgmea_.protity;

import com.example.bgmea.bgmea_.AppendableObjectOutputStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class ProductionManagergoal1 {

    @FXML
    private Label messageLabel;

    @FXML
    private TextField targetField;

    @FXML
    private ChoiceBox<String> lineChoice;

    @FXML
    private TextField workerField;


    static ArrayList<ProductionManagerModelclass1> list = new ArrayList<>();

    @FXML
    public void initialize() {
        lineChoice.getItems().addAll("Line A", "Line B", "Line C");
    }

    @FXML
    void ReturnHomeBtn(ActionEvent actionEvent) {
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
    public void SavePlan(ActionEvent actionEvent) {



        String line = lineChoice.getValue();
        String workerText = workerField.getText();
        String targetText = targetField.getText();

        if (line == null || workerText.isEmpty() || targetText.isEmpty()) {
            messageLabel.setText("Please fill all fields!");
            return;
        }

        try {
            int workers = Integer.parseInt(workerText);
            int target = Integer.parseInt(targetText);

            ProductionManagerModelclass1 data =
                    new ProductionManagerModelclass1(line,"Assigned", workers);

            list.add(data);

            File f = new File("ProductionPlan.bin");
            ObjectOutputStream oos;

            if (f.exists()) {
                oos = new AppendableObjectOutputStream(new FileOutputStream(f, true));
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(f));
            }

            oos.writeObject(data);
            oos.close();

            messageLabel.setText("Saved successfully!");

            workerField.clear();
            targetField.clear();

        } catch (NumberFormatException e) {
            messageLabel.setText("Enter valid numbers!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}