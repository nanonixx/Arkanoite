package game.Objects.Brick;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class BrickFactory {

    private ArrayList<Brick> brickList = new ArrayList<>();

    public ArrayList<Brick> getBrickList() {
        return brickList;
    }

    public void setBrickList(ArrayList<Brick> brickList) {
        this.brickList = brickList;
    }

    public void createBrickPattern(Pane canvas) {
        double dx = 60;
        double dy = 30;

        int BLOCK_COLUMNS = 7;
        for (int i = 0; i < BLOCK_COLUMNS; i++) {

            Brick brick = new Brick(dx, dy, Color.MAGENTA);
            brick.setId("A"+i);
            brickList.add(brick);
            canvas.getChildren().add(brick.draw());
            dx = dx + brick.getWIDTH() + 20; //deja un espacio de 20px

        }

        dx = 60;  //se deja el mismo espacio al principio

        for (int i = 0; i < BLOCK_COLUMNS; i++) {

            Brick brick = new Brick(dx, dy+55, Color.ORANGE);
            brick.setId("B"+i);
            brickList.add(brick);
            canvas.getChildren().add(brick.draw());
            dx = dx + brick.getWIDTH() + 20; //deja un espacio de 20px

        }

        dx = 60;  //se deja el mismo espacio al principio

        for (int i = 0; i < BLOCK_COLUMNS; i++) {

            Brick brick = new Brick(dx, dy+110, Color.YELLOW);
            brick.setId("C"+i);
            brickList.add(brick);
            canvas.getChildren().add(brick.draw());
            dx = dx + brick.getWIDTH() + 20; //deja un espacio de 20px

        }

        dx = 60;  //se deja el mismo espacio al principio

        for (int i = 0; i < BLOCK_COLUMNS; i++) {

            Brick brick = new Brick(dx, dy+165, Color.LIME);
            brick.setId("D"+i);
            brickList.add(brick);
            canvas.getChildren().add(brick.draw());
            dx = dx + brick.getWIDTH() + 20; //deja un espacio de 20px

        }

        dx = 60;  //se deja el mismo espacio al principio

        for (int i = 0; i < BLOCK_COLUMNS; i++) {

            Brick brick = new Brick(dx, dy+220, Color.CYAN);
            brick.setId("E"+i);
            brickList.add(brick);
            canvas.getChildren().add(brick.draw());
            dx = dx + brick.getWIDTH() + 20; //deja un espacio de 20px

        }

        System.out.println(brickList.size());
    }

}
