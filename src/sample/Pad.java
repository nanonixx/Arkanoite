package sample;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.awt.*;

public class Pad{

    int x;
    int y = 0;
    Rectangle rec = new Rectangle(20,50);

    public Pad(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void movePad(){
        if(Keyevent.a && x > 0) x--;
        if(Keyevent.d && x < 1000) x++;
    }
}
