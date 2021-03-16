package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public void start(ActionEvent actionEvent) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/Game.fxml"));
        Stage stage = new Stage();
        stage.getIcons().add(new Image("/sample/arkanoite_icon.png"));
        Scene scene = new Scene(root);
        stage.setTitle("Arkanoite jugando");
        stage.setScene(scene);
        stage.show();


        Ball ball = new Ball();
        ball.start(stage);



    }

    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }
}
