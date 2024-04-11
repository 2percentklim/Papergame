module com.example.papergame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.papergame to javafx.fxml;
    exports com.example.papergame;
}