package sample.Brick;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class BrickFactory {

    int BLOCK_COLUMNS = 7;


    public void createBrickPattern(Pane canvas) {
        double dx = 60;
        double dy = 30;

        for (int i = 0; i < BLOCK_COLUMNS; i++) {

            Brick brick = new Brick(dx, dy, Color.MAGENTA);
            canvas.getChildren().add(brick.draw());
            dx = dx + brick.getWIDTH() + 20; //deja un espacio de 20px

        }

        dx = 60;  //se deja el mismo espacio al principio

        for (int i = 0; i < BLOCK_COLUMNS; i++) {

            Brick brick = new Brick(dx, dy+55, Color.ORANGE);
            canvas.getChildren().add(brick.draw());
            dx = dx + brick.getWIDTH() + 20; //deja un espacio de 20px

        }

        dx = 60;  //se deja el mismo espacio al principio

        for (int i = 0; i < BLOCK_COLUMNS; i++) {

            Brick brick = new Brick(dx, dy+110, Color.YELLOW);
            canvas.getChildren().add(brick.draw());
            dx = dx + brick.getWIDTH() + 20; //deja un espacio de 20px

        }

        dx = 60;  //se deja el mismo espacio al principio

        for (int i = 0; i < BLOCK_COLUMNS; i++) {

            Brick brick = new Brick(dx, dy+165, Color.LIME);
            canvas.getChildren().add(brick.draw());
            dx = dx + brick.getWIDTH() + 20; //deja un espacio de 20px

        }

        dx = 60;  //se deja el mismo espacio al principio

        for (int i = 0; i < BLOCK_COLUMNS; i++) {

            Brick brick = new Brick(dx, dy+220, Color.CYAN);
            canvas.getChildren().add(brick.draw());
            brick.id = i;

            dx = dx + brick.getWIDTH() + 20; //deja un espacio de 20px

        }
    }

}
