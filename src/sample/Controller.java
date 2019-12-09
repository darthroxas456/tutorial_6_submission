package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

  @FXML private Text helloTXT;

  @FXML private Button HelloBTN;

  @FXML
  void handlePressedAction(ActionEvent event) {
    helloTXT.setText("You pressed the button!");
  }
}
