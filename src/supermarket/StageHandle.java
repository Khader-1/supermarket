package supermarket;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StageHandle {
    private Stage mainStage;
    
    public StageHandle(){
        mainStage = Supermarket.getStage();
    }
    
    public void changeView(String location) throws IOException{
        
        Parent newScene= FXMLLoader.load(getClass().getResource(location + ".fxml"));
        mainStage.setScene(new Scene(newScene));
    }
}
