package app;

import java.util.Scanner;
import app.CommonView;

/** Unfortunately does not work with terminal commands. Only run by clicking "Run"
 * The compiler does not see other classes!!
 */

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