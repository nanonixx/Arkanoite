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

    private int x;
    private int y;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Circle pelotinga = new Circle(10, Color.YELLOW);

    Timeline timeline = new Timeline(new KeyFrame(Duration.millis(50), new EventHandler<ActionEvent>() {

        double dx = 7;
        double dy = 3;

        @Override
        public void handle(ActionEvent actionEvent) {

            pelotinga.setLayoutX(pelotinga.getLayoutX() + dx);
            pelotinga.setLayoutY(pelotinga.getLayoutY() + dy);



                if (pelotinga.getLayoutX() < 0 || pelotinga.getLayoutX() > 1000)
                    dx = -dx;

                if (pelotinga.getLayoutY() < 0 || pelotinga.getLayoutY() > 600)
                    dy = -dy;


        }
    }));

}

