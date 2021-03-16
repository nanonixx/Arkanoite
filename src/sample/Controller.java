package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class Controller {
    public void start(ActionEvent actionEvent) throws IOException {
        Button b = (Button) actionEvent.getSource();



        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/Game.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Arkanoite jugando");
        stage.setScene(scene);
        stage.show();
    }

    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }
}
