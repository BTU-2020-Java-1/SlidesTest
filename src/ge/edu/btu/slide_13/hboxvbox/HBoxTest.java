package ge.edu.btu.slide_13.hboxvbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxTest extends Application {

    @Override
    public void start(Stage stage) {
        Label label1 = new Label("Label1");
        Label label2 = new Label("Label2");
        Label label3 = new Label("Label3");
        Label label4 = new Label("Label4");

        HBox hBox = new HBox();
        hBox.setSpacing(20);
        hBox.setAlignment(Pos.TOP_CENTER);
        hBox.setPadding(new Insets(30, 10, 10, 10));
        hBox.getChildren().addAll(label1, label2, label3, label4);

        Scene scene = new Scene(hBox, 300, 150);

        stage.setTitle("HBox Test");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
