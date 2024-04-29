package main;

import javax.swing.JFrame;

public class GameWindow {
    private JFrame jframe;
    public GameWindow(GamePanel gamePanel) {
        // Creates new object
        jframe = new JFrame();

        // Sets window size
        jframe.setSize(400, 400);

        // Makes sure the program exits appropriately
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.add(gamePanel);

        jframe.setLocationRelativeTo(null);

        // Makes the window visible, needs to be at the bottom!
        jframe.setVisible(true);

    }
}
