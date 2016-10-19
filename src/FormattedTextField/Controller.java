package FormattedTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.util.converter.IntegerStringConverter;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private TextField myTextField;

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TextFormatter<Integer> textFormatter = new TextFormatter<>(new IntegerStringConverter(), 0);
        myTextField.setTextFormatter(textFormatter);
    }

    public void handleTextFieldAction() {
        // FIXME: liefert nicht den vom Formatter angegebenen Wert!
        System.out.println(myTextField.getText());
    }

    public void handleGoButtonAction() {
        System.out.println(myTextField.getText());
    }
}
