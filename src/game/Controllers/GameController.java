package game.Controllers;


import game.Objects.Brick.Brick;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;
import game.Objects.Ball;
import game.Objects.Brick.BrickFactory;
import game.Main;
import game.Objects.Pad;

public class GameController extends Application {
    int scoreCount = 0;
    Label scoreLabel = new Label("Score: " + scoreCount);

    public int livesCount = 3;
    Label livesLabel = new Label("Lives: " + livesCount);
    Label gameOver = new Label("ah te moriste");
    Button nextLevel = new Button();

    @Override
    public void start(Stage stage) throws Exception {
        String CSS_PATH = "/game/css/game.css";

        Pane canvas = new Pane();

        scoreLabel.setLayoutY(565);
        scoreLabel.setLayoutX(30);
        scoreLabel.setFont(Font.font(20));
        scoreLabel.setTextFill(Color.WHITE);

        livesLabel.setLayoutY(565);
        livesLabel.setLayoutX(850);
        livesLabel.setFont(Font.font(20));
        livesLabel.setTextFill(Color.WHITE);

        gameOver.setLayoutY(300);
        gameOver.setLayoutX(500);
        gameOver.setFont(Font.font(20));
        gameOver.setTextFill(Color.WHITE);



        Scene scene = new Scene(canvas, 1000, 600);

        BrickFactory brickFactory = new BrickFactory();
        brickFactory.createBrickPattern(canvas);

        Pad pad = new Pad(500);
        Ball ball = new Ball(0,599);



        canvas.getChildren().add(ball.pelotinga);
        canvas.getChildren().add(pad.draw());
        canvas.getChildren().add(scoreLabel);
        canvas.getChildren().add(livesLabel);




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
                        scoreCount+=10;
                        scoreLabel.setText("Score: " + scoreCount);
                        canvas.getChildren().add(scoreLabel);

                    }
                }

                if(brickFactory.getBrickList().isEmpty()){
                    canvas.getChildren().clear();
                }

                if(ball.pelotinga.getLayoutY() > 600){
                    ball.setY(ball.getY() * -1);
                    ball.pelotinga.setLayoutX(0);
                    ball.pelotinga.setLayoutY(599);
                    livesCount--;

                    if(livesCount == 0){

                        canvas.getChildren().clear();
                        canvas.getChildren().add(gameOver);
                        ball.timeline.stop();

                    }else {

                        livesLabel.setText("Lives: " + livesCount);
                        canvas.getChildren().add(livesLabel);

                    }

                }

                }
        }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
