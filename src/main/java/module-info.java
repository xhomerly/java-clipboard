module com.xhomerly.clipboard {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.xhomerly.clipboard to javafx.fxml;
    exports com.xhomerly.clipboard;
}