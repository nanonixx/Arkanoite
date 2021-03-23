package sample;


import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import sample.Brick.BrickFactory;

public class GameController extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        String CSS_PATH = "/sample/css/game.css";

        Pane canvas = new Pane();
        Scene scene = new Scene(canvas, 1000, 600, Color.TRANSPARENT);

        BrickFactory brickFactory = new BrickFactory();
        brickFactory.createBrickPattern(canvas);

        Pad pad = new Pad(500);
        Ball ball = new Ball(5,5);

        canvas.getChildren().add(ball.pelotinga);
        canvas.getChildren().add(pad.draw());

        ball.timeline.setCycleCount(Timeline.INDEFINITE);
        ball.timeline.play();

        pad.movePad(scene);

        scene.getStylesheets().add(String.valueOf(Main.class.getResource(CSS_PATH)));
        stage.setScene(scene);
        stage.show();
    }
}
