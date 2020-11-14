module GUI {

    // This is required for the FXML to work. im not sure what it fully does, but its probably the same as importing
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;

    // turns everything in the cput package into FXML
    opens cput to javafx.fxml;

    // Exports this FXML package
    exports cput;
}