package app;

import java.util.Scanner;

/**
 * 
 * Remember about changing to another branch !!!!!!!!!!!!! Don't work on branch
 * Development and Master!!!!!!!!!!!!!
 * 
 */

public class App {
    private Boolean isContinue;

    private App() {
        this.isContinue = true;
    }

    private Boolean getIsContinue() {
        return this.isContinue;
    }

    public static void main(String[] args) throws Exception {
        CommonView.clearScreen();

        App game = new App();
        while (game.getIsContinue()) {
            // game.gameLoop();
            LoopingGame.gameLoop();
        }
    }
}