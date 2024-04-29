package main;

public class Game {

    private GameWindow gameWindow;
    private GamePanel gamePanel;

    // Default constructor
    public Game() {
    gamePanel = new GamePanel();
    gameWindow = new GameWindow(gamePanel);
    }
}
