module com.example.bgmea.bgmea_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bgmea.bgmea_ to javafx.fxml;
    exports com.example.bgmea.bgmea_;
}