package game.Objects.Brick;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Brick {

    private final double WIDTH = 110;
    private final double HEIGHT = 40;
    double dx, dy; //posicion
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Color color;

    public double getWIDTH() {
        return WIDTH;
    }

    public double getHEIGHT() {
        return HEIGHT;
    }

    public Brick(double dx, double dy, Color c) {
        this.dx = dx;
        this.dy = dy;
        this.color = c;

    }

    public Rectangle rectangle;

    public Shape draw(){
        rectangle = new Rectangle(WIDTH, HEIGHT, color);
        rectangle.setX(dx);
        rectangle.setY(dy);


        return rectangle;
    }









//    'dxsssssssssssssgf'
}
