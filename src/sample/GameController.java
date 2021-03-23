package sample;


import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import sample.Brick.Brick;
import sample.Brick.BrickFactory;

public class GameController extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        String CSS_PATH = "/sample/css/game.css";

        Pane canvas = new Pane();
        Scene scene = new Scene(canvas, 1000, 600, Color.TRANSPARENT);
        //Circle ball = new Circle(10, Color.YELLOW);
        //ball.relocate(5, 5);

        BrickFactory bf = new BrickFactory();
        bf.createBrickPattern(canvas);

        Ball ball = new Ball(5,5);
        canvas.getChildren().add(ball.pelotinga);
        ball.timeline.setCycleCount(Timeline.INDEFINITE);
        ball.timeline.play();

        scene.getStylesheets().add(String.valueOf(Main.class.getResource(CSS_PATH)));
        stage.setScene(scene);
        stage.show();
    }
}
