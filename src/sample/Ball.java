package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ball{

    private double x = 7;
    private double y = 3;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Circle pelotinga = new Circle(10, Color.YELLOW);

    Timeline timeline = new Timeline(new KeyFrame(Duration.millis(25), new EventHandler<ActionEvent>() {


        @Override
        public void handle(ActionEvent actionEvent) {

            pelotinga.setLayoutX(pelotinga.getLayoutX() + x);
            pelotinga.setLayoutY(pelotinga.getLayoutY() + y);



                if (pelotinga.getLayoutX() < 0 || pelotinga.getLayoutX() > 1000)
                    x = -x;

                if (pelotinga.getLayoutY() < 0 || pelotinga.getLayoutY() > 600)
                    y = -y;


        }
    }));

}

