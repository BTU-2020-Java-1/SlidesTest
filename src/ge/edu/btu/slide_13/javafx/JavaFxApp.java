package ge.edu.btu.slide_13.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Hello World");

        StackPane root = new StackPane();
        root.getChildren().add(label);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

