package sample.Brick;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Brick {

    double WIDTH = 110, HEIGHT = 40;
    double dx, dy; //posicion
    Color color;

    public Brick(double dx, double dy, Color c) {
        this.dx = dx;
        this.dy = dy;
        this.color = c;

    }

    public Shape draw(){
        Rectangle rectangle = new Rectangle(WIDTH, HEIGHT, color);
        rectangle.setX(dx);
        rectangle.setY(dy);


        return rectangle;
    }









//    'dxsssssssssssssgf'
}
