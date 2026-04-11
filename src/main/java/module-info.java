module com.example.bgmea.bgmea_ {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.example.bgmea.bgmea_ to javafx.fxml;
    opens com.example.bgmea.bgmea_.Taiba to javafx.fxml;
    opens com.example.bgmea.bgmea_.protity to javafx.fxml;

    exports com.example.bgmea.bgmea_;
    exports com.example.bgmea.bgmea_.Taiba;
    exports com.example.bgmea.bgmea_.protity;
}



