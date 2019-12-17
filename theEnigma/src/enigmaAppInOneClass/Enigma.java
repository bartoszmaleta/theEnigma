package enigmaAppInOneClass;

import java.util.Scanner;
import enigmaAppInOneClass.*;

/**
 * 
 * Remember about changing to another branch !!!!!!!!!!!!! Don't work on branch
 * Development and Master!!!!!!!!!!!!!
 * 
 */

/**
 * To run option three write in terminal: >>>>>>>>>>> java Enigma.java
 * <firstArgument> <secondArgument> -l <<<<<<<<<<<<<<< for example: java
 * Enigma.java Bartosz Maleta -l
 * 
 */

public class Enigma {
    public static StringBuffer encrypt(String text, int s) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) + s - 97) % 26 + 96);
                result.append(ch);
            }
        }
        return result;
    }
    
    public static void main(String[] args) throws Exception {

        System.out.println("Cyphering");
        String text = "ATTACKATONCE";
        int s = 4;


        int firstElementOfArrayInArgsOfFunction = 0;
        int secondElementOfArrayInArgsOfFunction = 1;
        int thirdElementOfArrayInArgsOfFunction = 2;
        int fourthElementOfArrayInArgsOfFunction = 3;
        int fifthElementOfArrayInArgsOfFunction = 4;

        System.out.println();
        System.out.println("Your first argument of application is: " + args[firstElementOfArrayInArgsOfFunction]);
        // System.out.println("Your second argument of application is: " +
        // args[secondElementOfArrayInArgsOfFunction]);
        System.out.println("------------------");
        System.out.println();

        switch (args[firstElementOfArrayInArgsOfFunction]) {
        case "-l":
            System.out.println("Show all implemented ciphers");
            System.out.println("Available ciphers/deciphers: ");
            System.out.println("1. Ceasar (Enter 'CEASAR' as a second parameter of function)");
            break;

        case "-e":
            System.out.println("You are in encipher mode");
            switch (args[secondElementOfArrayInArgsOfFunction]) {
            case "CEASAR":
                System.out.println("You are in Ceasar mode");
                System.out.println();

                // StringBuffer encrypt(String text, int s)
                System.out.println();
                System.out.println("------------------");

                System.out.println("Text   : " + text);
                System.out.println("Shift  : " + s);
                System.out.println("Cipher : " + encrypt(text, s));

                System.out.println("------------------");

                // CeasarCipher.printbla(); // dont know why it does not compile
                // enigmaAppInOneClass.CeasarCipher.printbla(); // dont know why it does not
                // compile
            }
            break;

        case "-d":
            System.out.println("You are in decipher mode");
            break;
        }

    }
}