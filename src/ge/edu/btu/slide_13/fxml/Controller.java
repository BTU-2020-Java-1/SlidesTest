package ge.edu.btu.slide_13.fxml;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label label;

    @FXML
    private Button button;

    public void initialize() {
        button.setOnAction(actionEvent -> label.setText("New Label"));
    }
}

