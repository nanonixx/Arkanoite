package game.Objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ranking {
    int[] records = {140, 50, 120, 20, 60, 0};
    int[] elbueno = new int[5];

    public void addRecord(int score) {
        records[5] = score;

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

        for (int i = 0; i < 5; i++) {
            elbueno[i] = records[i];
        }

//        for (int i = 0; i < 5 ; i++) {
//            System.out.println(elbueno[i]);
//        }

    }

    public void showRecord(){
        for (int i = 0; i < 5 ; i++) {
            System.out.println(elbueno[i]);
        }
    }
}