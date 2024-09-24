package healthprojectdemo;


import healthprojectdemo.util.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class HealthApplication extends Application {

    public static HashMap<String, User> users = new HashMap<>();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HealthApplication.class.getResource("sign_in.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Health Application Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}