package game.Controllers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ranking extends Application {
    int[] records = new int[6];

    @FXML
    Label top1, top2, top3, top4, top5;

    public void log_reader(){

        try {
            BufferedReader inputStream = new BufferedReader(new FileReader("src/game/docs/log.txt"));
            String line = "";
            int i = 0;
            while((line=inputStream.readLine()) != null) {
                records[i] = Integer.parseInt(line);
                i++;
            }
            inputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void log_writer() {
        try {

            FileWriter log = new FileWriter("src/game/docs/log.txt", false);
            BufferedWriter outputStream = new BufferedWriter(log);
//            for (int score : records) {
//                outputStream.write(score +"\n");
//            }
            for (int i = 0; i < 6; i++) {
                outputStream.write(records[i]+"\n");
                if (i == 4) outputStream.write(records[i]);

            }
            outputStream.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

    public void sortRanking() {
        int temp;
        for (int i = 0; i <records.length; i++) {
            for (int j = i+1; j <records.length; j++) {
                if(records[i] < records[j]) {      //swap elements if not in order
                    temp = records[i];
                    records[i] = records[j];
                    records[j] = temp;
                }
            }
        }
    }

    public void addRecord(int score) {
        sortRanking();
        records[5] = score;
        sortRanking();
        log_writer();
    }

    public void showValues() {
        log_reader();
        sortRanking();
        top1.setText(String.valueOf(records[0]));
        top2.setText(String.valueOf(records[1]));
        top3.setText(String.valueOf(records[2]));
        top4.setText(String.valueOf(records[3]));
        top5.setText(String.valueOf(records[4]));
    }

    @Override
    public void start(Stage stage) {
        showValues();
    }

    public void resetValues(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "¿Seguro que quieres restaurar los records?", ButtonType.NO, ButtonType.YES);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES){
            for (int i = 0; i < 6; i++) {
                records[i] = 0;
            }
            log_writer();
            showValues();
        }

    }
}