module hr.algebra.ivancicvaric {
    requires javafx.controls;
    requires javafx.fxml;


    opens hr.algebra.ivancicvaric to javafx.fxml;
    exports hr.algebra.ivancicvaric;
}