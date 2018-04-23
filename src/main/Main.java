package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ResourceBundle resource = ResourceBundle.getBundle("res/text");
        Parent root = FXMLLoader.load(getClass().getResource("PhotoViewer.fxml"), resource);
        Scene scene = new Scene(root);

        scene.getStylesheets().add("style/photo_viewer.css");
        primaryStage.setTitle("Photo Viewer");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("res/image/icon.png"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
