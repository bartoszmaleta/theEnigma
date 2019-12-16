package app;

import java.util.Scanner;

/**

Remember about changing to another branch !!!!!!!!!!!!!
Don't work on branch Development and Master!!!!!!!!!!!!!

*/  

public class App {
    private Boolean isContinue;

    private void gameLoop() {
        System.out.println("Hello Java");


        MenuHandler.mainMenu();

        String yourMenuChoice;
        Scanner reader = new Scanner(System.in);
        yourMenuChoice = reader.nextLine().toLowerCase();

        switch (yourMenuChoice) {
            case "1":
                System.out.println("You are in option 1");
                break;
            case "2":
                System.out.println("You are in option 2");
                break;
            case "3":
                System.out.println("You are in option 3");
                System.exit(0);
                break;
        }

    }

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
            game.gameLoop();
        }
    }
}