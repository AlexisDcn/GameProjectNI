package Jeu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        GameView gameView = new GameView();
        Scene scene = new Scene(gameView, 800, 600);
        primaryStage.setTitle("Beach Clicker Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
