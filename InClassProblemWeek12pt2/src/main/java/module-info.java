module com.mycompany.inclassproblemweek12pt2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.inclassproblemweek12pt2 to javafx.fxml;
    exports com.mycompany.inclassproblemweek12pt2;
}
