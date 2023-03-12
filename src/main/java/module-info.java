module com.ictec.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ictec.calculator to javafx.fxml;
    exports com.ictec.calculator;
}