package sample;


import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;


public class Pad {

    int x;
    int y = 500; //posicion inicial

    private final int HEIGHT = 50;
    private final int WIDTH = 100;

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public Pad(int x) {
        this.x = x;
    }

    Rectangle rectangle = new Rectangle(WIDTH, HEIGHT, Color.YELLOWGREEN);


    public Shape draw(){
        rectangle.setX(x);
        rectangle.setY(y);
        return this.rectangle;
    }

    public void movePad(Scene scene){
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch(keyEvent.getCode()){
                    case A: case LEFT:
                        if(x > 0) {
                            x = x - 17;
                            draw();
                        }
                        break;
                    case D: case RIGHT:
                        if(x < 900) {
                            x = x + 17;
                            draw();
                        }
                        break;
                }
            }
        });
    }
}
