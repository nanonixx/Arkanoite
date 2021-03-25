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
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ball{

    public int x;
    public int y;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Rectangle pelotinga = new Rectangle(20, 20, Color.YELLOW);

    public Shape draw(){
        pelotinga.setX(x);
        pelotinga.setY(y);
        return pelotinga;
    }


    Timeline timeline = new Timeline(new KeyFrame(Duration.millis(26), new EventHandler<ActionEvent>() {

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

