package sample;


import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;


public class Pad {

    int x;
    int y = 500;

    public Pad(int x) {
        this.x = x;
        this.y = y;
    }

    Rectangle rectangle = new Rectangle(100, 50, Color.YELLOWGREEN);

    public Shape draw(){
        this.rectangle.relocate(x,y);
        return this.rectangle;
    }

    public void movePad(Scene scene){
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch(keyEvent.getCode()){
                    case A:
                        x = x - 7;
                        draw();
                        break;
                    case D:
                        x = x + 7;
                        draw();
                        break;
                }
                System.out.println(x);
            }
        });
    }
}
