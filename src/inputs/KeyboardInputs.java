package inputs;

import main.GamePanel;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyboardInputs implements KeyListener {

    private GamePanel gamePanel;
    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }
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
                gamePanel.changeYDelta(-5);
                break;
                // left
            case KeyEvent.VK_A:
                gamePanel.changeXDelta(-5);
                break;
            case KeyEvent.VK_S:
                // down
                gamePanel.changeYDelta(5);
                break;
            case KeyEvent.VK_D:
                // right
                gamePanel.changeXDelta(5);
                break;
        }
    }
}