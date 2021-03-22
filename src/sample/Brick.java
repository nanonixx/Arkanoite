package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Brick {

    double WIDTH = 200, HEIGHT = 50;
    double dx, dy; //posicion
    Color color;

    public Brick(double dx, double dy, Color c) {
        this.dx = dx;
        this.dy = dy;
        this.color = c;

    }

    public Shape draw(){
        Rectangle rectangle = new Rectangle(WIDTH, HEIGHT, Color.MAGENTA);
        rectangle.setX(dx);
        rectangle.setY(dy);
        // ¿?
        return rectangle;
    }





//    'dxsssssssssssssgf'
}
