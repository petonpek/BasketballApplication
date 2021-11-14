package me.p3074098.basketballapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationEntry extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationEntry.class.getResource("controller/application.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Basketball Scorekeeper");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch();
    }
}