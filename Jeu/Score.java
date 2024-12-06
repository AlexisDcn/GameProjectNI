package Jeu;

import javafx.scene.canvas.GraphicsContext;

public class Score {
    private int score;

    public Score() {
        score = 0;
    }

    public void updateScore() {
        score++;
    }

    public void draw(GraphicsContext gc) {
        gc.setFill(javafx.scene.paint.Color.BLACK);
        gc.fillText("Score: " + score, 10, 20);
    }
}
