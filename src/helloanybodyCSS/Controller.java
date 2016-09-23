package helloanybodyCSS;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textFieldName;

    @FXML
    private Button buttonSay;

    public void handleButtonAction(ActionEvent actionEvent) {
        System.out.println("Hello " + textFieldName.getText() + "!");
        buttonSay.setText("Say Hello again");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Hello Dialog");
        alert.setHeaderText("Look, a greeting Dialog");
        alert.setContentText("Hello " + textFieldName.getText() + "!");
        alert.showAndWait();

    }
}
