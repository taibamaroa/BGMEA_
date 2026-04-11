package com.example.bgmea.bgmea_.Taiba;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class HR3 {

    @FXML
    private TableColumn<HRModelclass1, LocalDate> colJoiningDate;

    @FXML
    private TableColumn<HRModelclass1, String> colName;

    @FXML
    private TableColumn<HRModelclass1, String> colid;

    @FXML
    private TableColumn<HRModelclass1, String> colnid;

    @FXML
    private Label msgLabel;
    ArrayList<HRModelclass1> list = new ArrayList<>();
    @FXML
    private TableView <HRModelclass1>workertable;


    @javafx.fxml.FXML
    public void initialize() {
        colid.setCellValueFactory(new PropertyValueFactory<>("workerId"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colnid.setCellValueFactory(new PropertyValueFactory<>("nid"));
        colJoiningDate.setCellValueFactory(new PropertyValueFactory<>("joiningDate"));
    }

    @FXML
    void returnBtn(ActionEvent actionEvent) throws IOException {

        try {
            Scene scene = ((Button) actionEvent.getSource()).getScene();
            Stage stage = (Stage) scene.getWindow();

            FXMLLoader scene2FxmlLoader = new FXMLLoader(HRDashboard.class.getResource("/com/example/bgmea/bgmea_./Taiba/HRDashboard.fxml"));
            Scene scene2 = new Scene(scene2FxmlLoader.load());
            stage.setScene(scene2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }}

    @FXML
    void searchBtn(ActionEvent event) {
        File f = new File("HR.bin");

        FileInputStream fis;
        ObjectInputStream ois;

        try {
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            workertable.getItems().clear();
            list.clear();

            while (true) {
                try {
                    HRModelclass1 s = (HRModelclass1) ois.readObject();
                    list.add(s);
                    workertable.getItems().add(s);
                } catch (EOFException e) {
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void sendBtn(ActionEvent event) {
        msgLabel.setText("Sent successfully!");

    }

}