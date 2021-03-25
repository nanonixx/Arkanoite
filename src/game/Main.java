package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {

    String CSS_PATH = "/game/css/main_menu.css";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/MainMenu.fxml"));
        Scene scene = new Scene(root);
        primaryStage.getIcons().add(new Image("/game/images/arkanoite_icon.png"));
        primaryStage.setTitle("Arkanoite");
        scene.getStylesheets().add(String.valueOf(Main.class.getResource(CSS_PATH)));
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {launch(args); }
}
