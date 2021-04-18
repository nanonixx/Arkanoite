package game.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    GameController gameController;
    Ranking ranking;
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

    public void goRanking(ActionEvent actionEvent) throws Exception {
        ranking = new Ranking();
        Parent root = FXMLLoader.load(getClass().getResource("/game/fxml/Ranking.fxml"));
        Stage stage = new Stage();
        stage.getIcons().add(new Image("/game/images/arkanoite_icon.png"));
        Scene scene = new Scene(root);
        stage.setTitle("Ranking");
        stage.setScene(scene);
        stage.show();


        ranking.start(stage);
        ranking.log_reader();
        ranking.showValues();


    }
}
