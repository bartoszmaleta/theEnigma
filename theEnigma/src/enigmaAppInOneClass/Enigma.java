package enigmaAppInOneClass;

import java.util.Scanner;
import enigmaAppInOneClass.*;

/**
 * 
 * TODO: change switch to "if else"
 * 
 * Remember about changing to another branch !!!!!!!!!!!!! Don't work on branch
 * Development and Master!!!!!!!!!!!!!
 * 
 */

/**
 * To run option three write in terminal for example: 
 * java Enigma.java -e CEASAR 4 It will encrypt hard-coded text with [KEY] = 4
 * 
 * java Enigma.java -d CEASAR 4 It will decrypt hard-coded textToDecrypt with [KEY] = 4
 * 
 */

public class Enigma {
    static String text = "ATTACKATONCE";
    static String textToDecrypt = "EXXEGOEXSRGI";

    static int firstElementOfArrayInArgsOfFunction = 0;
    static int secondElementOfArrayInArgsOfFunction = 1;
    static int thirdElementOfArrayInArgsOfFunction = 2;
    static int fourthElementOfArrayInArgsOfFunction = 3; // redundnat, maybe will be useful in future
    static int fifthElementOfArrayInArgsOfFunction = 4; // redundnat, maybe will be useful in future

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

    public static void encryptingView() {

    }

    public static StringBuffer decrypt(String text, int g) {
        g = -g;
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + g - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) + g - 97) % 26 + 96);
                result.append(ch);
            }
        }
        return result;
    }

    public static void printAllCiphers() {

    }

    public static void main(String[] args) throws Exception {

        System.out.println("ENIGMA");
        int intputedThirdAgument = Integer.parseInt(args[thirdElementOfArrayInArgsOfFunction]);

        System.out.println();
        System.out.println("Your first argument of application is: " + args[firstElementOfArrayInArgsOfFunction]);
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

                System.out.println("------------------");
                System.out.println("Cyphering");
                System.out.println("Text   : " + text);
                System.out.println("Shift  : " + intputedThirdAgument);
                System.out.println("Cipher : " + encrypt(text, intputedThirdAgument));

                System.out.println("------------------");

                // CeasarCipher.printbla(); // dont know why it does not compile
                // enigmaAppInOneClass.CeasarCipher.printbla(); // dont know why it does not
                // compile
            }
            break;

        case "-d":
            System.out.println("You are in decipher mode");
            switch (args[secondElementOfArrayInArgsOfFunction]) {
            case "CEASAR":
                System.out.println();
                System.out.println("------------------");

                System.out.println("Decyphering");
                System.out.println("Text      : " + textToDecrypt);
                System.out.println("Shift     : " + intputedThirdAgument);
                System.out.println("Decipherd : " + decrypt(textToDecrypt, intputedThirdAgument));

            }
            break;
        }

    }
}