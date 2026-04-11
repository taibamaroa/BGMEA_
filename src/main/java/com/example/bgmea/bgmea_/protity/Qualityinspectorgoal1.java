package com.example.bgmea.bgmea_.protity;


import com.example.bgmea.bgmea_.AppendableObjectOutputStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class Qualityinspectorgoal1
{

    @FXML
    private TextField batchIdField;

    @FXML
    private TextField batchTF;

    @FXML
    private DatePicker productionDate;

    @FXML
    private TextField statusTF;

    @FXML
    private Label textlabel;
    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void ReturnHomeBtn(ActionEvent actionEvent) throws IOException {

        try {
            Scene scene = ((Button) actionEvent.getSource()).getScene();
            Stage stage = (Stage) scene.getWindow();

            FXMLLoader scene2FxmlLoader = new FXMLLoader(QualityinspectorDashboard.class.getResource("/com/example/bgmea/Shahtaz/QualityinspectorDashboard.fxml"));
            Scene scene2 = new Scene(scene2FxmlLoader.load());
            stage.setScene(scene2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }}

    @FXML
    void BatchsaveBtn(ActionEvent event) {
        String id = batchIdField.getText();
        String name = batchTF.getText();
        LocalDate date = productionDate.getValue();
        String status = statusTF.getText();

        if (id.isEmpty() || name.isEmpty() || status.isEmpty() || date == null) {
            textlabel.setText("Please fill all fields!");
            return;
        }
        try {
            QualityinspectorModelclass2 data =
                    new QualityinspectorModelclass2(id, name, date, status);

            File f = new File("QualityData.bin");
            ObjectOutputStream oos;
            if (f.exists()) {
                oos = new AppendableObjectOutputStream(new FileOutputStream(f, true));
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(f));
            }

            oos.writeObject(data);
            oos.close();
            textlabel.setText("Saved successfully!");


            batchIdField.clear();
            batchTF.clear();
            statusTF.clear();
            productionDate.setValue(null);

        } catch (NumberFormatException e) {
            textlabel.setText("Error saving data!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}