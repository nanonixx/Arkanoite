package sample;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyevent implements KeyListener {
    static boolean a, d;
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int tecla = keyEvent.getKeyCode();

        if(tecla == KeyEvent.VK_A) a = true;

        if(tecla == KeyEvent.VK_D) d = true;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        int tecla = keyEvent.getKeyCode();

        if(tecla == KeyEvent.VK_A) a = false;
        if(tecla == KeyEvent.VK_D) d = false;

    }
}
