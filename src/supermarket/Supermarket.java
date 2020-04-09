package supermarket;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Supermarket extends Application {

    private static Stage mainstage;

    public static void setStage(Stage stage) {
        mainstage = stage;
    }

    public static Stage getStage() {
        return mainstage;
    }

    @Override
    public void start(Stage stage) throws Exception {
        mainstage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch(args);

    }

}
