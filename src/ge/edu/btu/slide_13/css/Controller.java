package ge.edu.btu.slide_13.css;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label label;

    public void changeLabelStyle() {
        label.setStyle("-fx-font-size: 18px; -fx-text-fill: green;");
    }
}

