package game.Controllers;

import game.Objects.Ranking;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    GameController gameController;
    public void start(ActionEvent actionEvent) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/game/fxml/Game.fxml"));
        Stage stage = new Stage();
        stage.getIcons().add(new Image("/game/images/arkanoite_icon.png"));
        Scene scene = new Scene(root);
        stage.setTitle("Arkanoite jugando");
        stage.setScene(scene);
        stage.show();

        gameController = new GameController();
        gameController.start(stage);



    }

    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void goRanking(ActionEvent actionEvent) throws IOException {
        gameController.ranking.showRecord();
        Parent root = FXMLLoader.load(getClass().getResource("/game/fxml/Game.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
