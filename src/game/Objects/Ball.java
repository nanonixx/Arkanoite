package game.Objects;

import game.Controllers.GameController;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Ball{

    GameController gameController;



    private double x = 7;
    private double y  = -3;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Ball(int x, int y) {
        pelotinga.setLayoutX(x);
        pelotinga.setLayoutY(y);
    }

    public Circle pelotinga = new Circle(10, Color.YELLOW);



    public Timeline timeline = new Timeline(new KeyFrame(Duration.millis(25), new EventHandler<ActionEvent>() {


        @Override
        public void handle(ActionEvent actionEvent) {

            pelotinga.setLayoutX(pelotinga.getLayoutX() + x);
            pelotinga.setLayoutY(pelotinga.getLayoutY() + y);



                if (pelotinga.getLayoutX() < 0 || pelotinga.getLayoutX() > 1000)
                    x = -x;

                if (pelotinga.getLayoutY() < 0)
                    y = -y;


        }
    }));

}

