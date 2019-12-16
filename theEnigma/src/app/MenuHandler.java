package app;

import java.util.Scanner;

public class MenuHandler {
    public static void mainMenu() {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("THE ENIGMA");
            System.out.println("\n[1]-start the Enigma");
            System.out.println("[2]-credits");
            System.out.println("[3]-exit game");
            System.out.println("\nChoose one option: ");
            isRunning = false;
        }

    }
}