package Jeu;

import javafx.scene.input.MouseEvent;

public class GameController {
    private BeachElement beachElement;
    private Score score;

    public GameController() {
        beachElement = new BeachElement();
        score = new Score();
    }

    public void handleClick(MouseEvent event) {
        beachElement.handleClick(event.getX(), event.getY());
        score.updateScore();
    }

    public BeachElement getBeachElement() {
        return beachElement;
    }

    public Score getScore() {
        return score;
    }
}
