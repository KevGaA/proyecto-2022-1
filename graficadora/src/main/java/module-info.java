module com.mycompany.graficadora {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.graficadora to javafx.fxml;
    exports com.mycompany.graficadora;
}
