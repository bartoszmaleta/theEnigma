package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        String yourMenuChoice;

        MenuHandler.mainMenu();

        Scanner reader = new Scanner(System.in);
        yourMenuChoice = reader.nextLine().toLowerCase();

    }
}