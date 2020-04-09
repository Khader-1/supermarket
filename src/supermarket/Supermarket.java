package supermarket;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Supermarket extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        Parent fxml2 = FXMLLoader.load(getClass().getResource("FXMLDocument_1.fxml"));
        Scene scene1 = new Scene(fxml2);
        stage.setScene(scene1);
    }

    public static void main(String[] args) {
        
        launch(args);
        
    }
    
}
