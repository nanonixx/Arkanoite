package sample;


import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GameController extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        String CSS_PATH = "/sample/css/game.css";

        Pane canvas = new Pane();
        Scene scene = new Scene(canvas, 1000, 600, Color.TRANSPARENT);
        //Circle ball = new Circle(10, Color.YELLOW);
        //ball.relocate(5, 5);

        Brick brick = new Brick(30, 30, Color.MAGENTA);
        Ball ball = new Ball(5,5);
        canvas.getChildren().add(brick.draw()); //DIBUJA LADRILLO
        canvas.getChildren().add(ball.pelotinga);
        ball.timeline.setCycleCount(Timeline.INDEFINITE);
        ball.timeline.play();

        scene.getStylesheets().add(String.valueOf(Main.class.getResource(CSS_PATH)));
        stage.setScene(scene);
        stage.show();
    }
}
