module com.example.labirintus__ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labirintus__ to javafx.fxml;
    exports com.example.labirintus__;
}