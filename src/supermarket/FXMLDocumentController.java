package supermarket;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
public class FXMLDocumentController implements Initializable {

    @FXML
    AnchorPane AnchorPane;
    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        new StageHandle().changeView("FXMLDocument_1");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
