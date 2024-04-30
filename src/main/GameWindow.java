package main;

import javax.swing.JFrame;

public class GameWindow {
    private JFrame jframe;
    public GameWindow(GamePanel gamePanel) {
        // Creates new object
        jframe = new JFrame();

        // Makes sure the program exits appropriately
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.add(gamePanel);

        // Places the game window right in the center of the screen
        jframe.setLocationRelativeTo(null);

        jframe.setResizable(false);

        // Set the window size to the prefered size of its components
        jframe.pack();

        // Makes the window visible, needs to be at the bottom!
        jframe.setVisible(true);
    }
}