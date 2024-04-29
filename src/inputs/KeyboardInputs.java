package inputs;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyboardInputs implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
                // up
            case KeyEvent.VK_W:
                System.out.println("W was pressed");
                break;
                // left
            case KeyEvent.VK_A:
                System.out.println("A was pressed");
                break;
            case KeyEvent.VK_S:
                // down
                System.out.println("S was pressed");
                break;
            case KeyEvent.VK_D:
                // right
                System.out.println("D was pressed");
                break;

        }
    }
}
