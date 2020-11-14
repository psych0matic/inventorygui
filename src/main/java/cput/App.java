package cput;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        /* Creates the application and shows the login form */
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(root,911,576));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}