package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {

    String CSS_PATH = "/sample/css/game.css";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/MainMenu.fxml"));
        primaryStage.getIcons().add(new Image("/sample/arkanoite_icon.png"));
        primaryStage.setTitle("Arkanoite");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {launch(args); }
}
