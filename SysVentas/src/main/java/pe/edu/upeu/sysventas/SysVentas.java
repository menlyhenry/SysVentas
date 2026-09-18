package pe.edu.upeu.sysventas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
<<<<<<< HEAD
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import pe.edu.upeu.sysventas.config.AppContext;
=======
import javafx.scene.Scene;
import javafx.stage.Stage;
>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33

import java.io.IOException;

public class SysVentas extends Application {
    @Override
    public void start(Stage stage) throws IOException {
<<<<<<< HEAD
        AppContext appContext=AppContext.getInstance();
        Screen screen=Screen.getPrimary();
        FXMLLoader fxmlLoader = new FXMLLoader(SysVentas.class.getResource("/view/main_producto.fxml"));
        fxmlLoader.setControllerFactory(appContext::getBean);
        Rectangle2D dimension=screen.getBounds();

        Scene scene = new Scene(fxmlLoader.load(), dimension.getWidth(), dimension.getHeight()-60);
=======
        FXMLLoader fxmlLoader = new FXMLLoader(SysVentas.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33
        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
