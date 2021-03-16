package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ball extends Application{

    @Override
    public void start(Stage stage) {

        Pane canvas = new Pane();
        Scene scene = new Scene(canvas, 1000, 600, Color.ALICEBLUE);
        Circle ball = new Circle(10, Color.CADETBLUE);
        ball.relocate(5, 5);

        Circle ball1 = new Circle(10, Color.CADETBLUE);

        canvas.getChildren().add(ball);
        stage.setScene(scene);
        stage.show();

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1), new EventHandler<ActionEvent>() {

            double dx = 7;
            double dy = 3;

            @Override
            public void handle(ActionEvent actionEvent) {

                ball.setLayoutX(ball.getLayoutX() + dx);
                ball.setLayoutY(ball.getLayoutY() + dy);

                Bounds bounds = canvas.getBoundsInLocal();
                System.out.println(bounds);
                if(ball.intersects(bounds)){
                    if (ball.getLayoutX() < 0 || ball.getLayoutX() > 1000)
                        dx = -dx;

                    if (ball.getLayoutY() < 0 || ball.getLayoutY() > 600)
                        dy = -dy;

                }
            }
        }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();


    }
}

