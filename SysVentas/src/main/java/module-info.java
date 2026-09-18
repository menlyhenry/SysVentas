module pe.edu.upeu.sysventas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires static lombok;
    requires jakarta.validation;

    opens pe.edu.upeu.sysventas to javafx.fxml;
<<<<<<< HEAD
    opens pe.edu.upeu.sysventas.controller to javafx.fxml;
=======
>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33
    exports pe.edu.upeu.sysventas;
}