package com.example.bgmea.bgmea_;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class Login {
    @javafx.fxml.FXML
    private PasswordField passwordTextField;
    @javafx.fxml.FXML
    private Label errorLabel;
    @javafx.fxml.FXML
    private TextField usernameTextField;
    //taiba
    private final String FinanceID = "Finance";
    private final String Financepassword = "1234";
    private final String HRID = "HR";
    private final String HRpassword = "1234";


    //protity
    private final String ProductionManagerID = "ProductionManager";
    private final String ProductionManagerpassword = "123";
    private final String QualityinspectorID = "Qualityinspector";
    private final String Qualityinspectorpassword = "123";


    @FXML
    public void LoginOnActionButton(ActionEvent actionEvent) throws IOException {
        String username = usernameTextField.getText().trim();
        String password = passwordTextField.getText().trim();
// Taiba
        if (username.equals(FinanceID) && password.equals(Financepassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/bgmea/Taiba/FinanceDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if (username.equals(HRID) && password.equals(HRpassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/bgmea/Taiba/HRDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

            //protity
        }else if (username.equals(ProductionManagerID) && password.equals(ProductionManagerpassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/bgmea/Shahtaz/ProductionManagerDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }else if (username.equals(QualityinspectorID) && password.equals(Qualityinspectorpassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/bgmea/Shahtaz/QualityinspectorDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();


        } else {
            errorLabel.setText("Incorrect username or password. Please try again.");
        }
    }

}