package inputs;

import main.GamePanel;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static utils.Constants.Directions.*;

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
        switch(e.getKeyCode()) {
            case KeyEvent.VK_W:
            case KeyEvent.VK_A:
            case KeyEvent.VK_S:
            case KeyEvent.VK_D:
                gamePanel.setMoving(false);
                break;
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
                // up
            case KeyEvent.VK_W:
                gamePanel.setDirection(UP);
                break;
                // left
            case KeyEvent.VK_A:
                gamePanel.setDirection(LEFT);
                break;
            case KeyEvent.VK_S:
                // down
                gamePanel.setDirection(DOWN);
                break;
            case KeyEvent.VK_D:
                // right
                gamePanel.setDirection(RIGHT);
                break;
        }
    }
}