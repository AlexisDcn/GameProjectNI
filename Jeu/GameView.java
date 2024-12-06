package Jeu;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

public class GameView extends StackPane {
    private GameController gameController;
    private Canvas canvas;

    public GameView() {
        gameController = new GameController();
        canvas = new Canvas(800, 600);
        getChildren().add(canvas);
        setOnMouseClicked(this::handleMouseClick);
        draw();
    }

    private void handleMouseClick(MouseEvent event) {
        gameController.handleClick(event);
        draw();
    }

    private void draw() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gameController.getBeachElement().draw(gc);
        gameController.getScore().draw(gc);
    }
}
