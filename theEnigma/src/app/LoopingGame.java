package app;

import java.util.Scanner;

public class LoopingGame {

    public static void gameLoop() {
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
}