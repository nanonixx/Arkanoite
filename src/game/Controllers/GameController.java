package game.Controllers;


import game.Objects.Brick.Brick;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import game.Objects.Ball;
import game.Objects.Brick.BrickFactory;
import game.Main;
import game.Objects.Pad;

public class GameController extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        String CSS_PATH = "/game/css/game.css";

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

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(50), new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                if (ball.pelotinga.getBoundsInParent().intersects(pad.rectangle.getBoundsInParent())){
                    ball.setY(ball.getY() * -1);
                }

                for (Brick b: brickFactory.getBrickList()) {
                    if (ball.pelotinga.getBoundsInParent().intersects(b.rectangle.getBoundsInParent())) {
                        b.color = Color.TRANSPARENT;
                        canvas.getChildren().remove(b.rectangle);
                        brickFactory.getBrickList().remove(b);
                        ball.setY(ball.getY() * -1);
                        System.out.println(brickFactory.getBrickList().size());
                    }
                }
                }
        }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
