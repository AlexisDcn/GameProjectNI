package Jeu;

import javafx.scene.canvas.GraphicsContext;

public class BeachElement {
    private int x, y;
    private boolean clicked;

    public BeachElement() {
        x = 100;
        y = 100;
        clicked = false;
    }

    public void handleClick(double clickX, double clickY) {
        if (clickX > x && clickX < x + 50 && clickY > y && clickY < y + 50) {
            clicked = true;
        }
    }

    public void draw(GraphicsContext gc) {
        if (clicked) {
            gc.setFill(javafx.scene.paint.Color.RED);
        } else {
            gc.setFill(javafx.scene.paint.Color.BLUE);
        }
        gc.fillRect(x, y, 50, 50);
    }
}
