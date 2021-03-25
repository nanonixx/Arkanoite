package game.Objects;


import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;


public class Pad {

    Image image = new Image("/game/images/tristesa.png");

    int x;
    int y = 500;

    public Pad(int x) {
        this.x = x;
        this.y = y;
    }

    public Rectangle rectangle = new Rectangle(110, 42, Color.YELLOWGREEN);



    public Shape draw(){
        this.rectangle.relocate(x,y);
        ImagePattern imageView = new ImagePattern(image);
        rectangle.setFill(imageView);

        return this.rectangle;
    }

    public void movePad(Scene scene){
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch(keyEvent.getCode()){
                    case A: case LEFT:
                        if(x > 0) {
                            x = x - 15;
                            draw();
                        }
                        break;
                    case D: case RIGHT:
                        if(x < 900) {
                            x = x + 15;
                            draw();
                        }
                        break;
                }
            }
        });
    }
}
