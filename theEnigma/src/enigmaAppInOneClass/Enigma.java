package enigmaAppInOneClass;

import java.util.Scanner;
import enigmaAppInOneClass.*;

/**
 * 
 * // Comment test to test branch default on github
 * TODO: change switch to "if else"
 * 
 * Remember about changing to another branch !!!!!!!!!!!!! Don't work on branch
 * Development and Master!!!!!!!!!!!!!
 * 
 */

/**
 * To run option three write in terminal for example: java Enigma.java -e CEASAR
 * 4 It will encrypt hard-coded text with [KEY] = 4
 * 
 * java Enigma.java -d CEASAR 4 It will decrypt hard-coded textToDecrypt with
 * [KEY] = 4
 * 
 */

public class Enigma {
    // static String text = "codecoolqweqwe";
    static String text;
    // static String textToDecrypt = "eduwasdas";
    static String textToDecrypt;

    static int firstElementOfArrayInArgsOfFunction = 0;
    static int secondElementOfArrayInArgsOfFunction = 1;
    static int thirdElementOfArrayInArgsOfFunction = 2;
    static int fourthElementOfArrayInArgsOfFunction = 3; // redundnat, maybe will be useful in future
    static int fifthElementOfArrayInArgsOfFunction = 4; // redundnat, maybe will be useful in future

    public static void printAllCiphers() {
        // TODO: 
    }

    // ------------------------------------------- CEASAR'S CIPHER METHODS START -------------------------------------------
    public static StringBuffer encryptCeasar(String text, int keyNumber) {
        StringBuffer result = new StringBuffer();
        keyNumber = keyNumber;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + keyNumber - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) + keyNumber - 96) % 26 + 96);
                result.append(ch);
            }
        }
        return result;
    }

    public static StringBuffer decryptCeasar(String text, int keyNumber) {
        // keyNumber = -keyNumber + 2;
        keyNumber = 26 - keyNumber;
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + keyNumber - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) + keyNumber - 96) % 26 + 96);
                result.append(ch);
            }
        }
        return result;
    }
    // ------------------------------------------- CEASAR'S CIPHER METHODS END -------------------------------------------




    // ------------------------------------------- ROT13 CIPHER METHODS START -------------------------------------------
    public static StringBuffer encryptROT13(String text) {
        int keyNumberForROT13 = 13;
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + keyNumberForROT13 - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) + keyNumberForROT13 - 96) % 26 + 96);
                result.append(ch);
            }
        }
        return result;
    }

    public static StringBuffer decryptROT13(String text) {
        int keyNumberForROT13 = 26 - 13;
        System.out.println(keyNumberForROT13);
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + keyNumberForROT13 - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) + keyNumberForROT13 - 96) % 26 + 96);
                result.append(ch);
            }
        }
        return result;
    }
    // ------------------------------------------- ROT13 CIPHER METHODS END -------------------------------------------

    // ------------------------------------------- MORSE CIPHER METHODS START -------------------------------------------
    
    // ------------------------------------------- MORSE CIPHER METHODS END -------------------------------------------

    public static void main(String[] args) throws Exception {

        System.out.println("ENIGMA");
        int intputedThirdAgument;

        System.out.println();
        System.out.println("Your first argument of application is: " + args[firstElementOfArrayInArgsOfFunction]);
        System.out.println("------------------");
        System.out.println();

        switch (args[firstElementOfArrayInArgsOfFunction]) {
        case "-l":
            System.out.println("All available ciphers/deciphers: ");
            System.out.println("1. Ceasar (Enter for example 'java Enigma.java -e CEASAR 4' turning on application.");
            System.out.println("First parameter - type of cipher");
            System.out.println("Second parameter - key of cipher (if needed)");
            break;

        case "-e":
            System.out.println("You are in encipher mode");
            switch (args[secondElementOfArrayInArgsOfFunction]) {
            case "CEASAR":
                System.out.println("You are in Ceasar mode");
                intputedThirdAgument = Integer.parseInt(args[thirdElementOfArrayInArgsOfFunction]);
                System.out.println();

                // Input text
                System.out.println("Enter text to encrypt:");
                Scanner reader = new Scanner(System.in);
                text = reader.nextLine().toLowerCase();

                System.out.println("------------------");

                System.out.println("Cyphering");
                System.out.println("Text   : " + text);
                System.out.println("Shift  : " + intputedThirdAgument);
                System.out.println("Cipher : " + encryptCeasar(text, intputedThirdAgument));

                System.out.println("------------------");

                // CeasarCipher.printbla(); // dont know why it does not compile
                // enigmaAppInOneClass.CeasarCipher.printbla(); // dont know why it does not
                // compile
                break;
            case "ROT13":
                System.out.println("You are in ROT13 mode");
                System.out.println();

                // Input text
                System.out.println("Enter text to encrypt:");
                Scanner readerROT13 = new Scanner(System.in);
                text = readerROT13.nextLine().toLowerCase();

                System.out.println("------------------");

                System.out.println("Cyphering...");
                System.out.println("Text   : " + text);
                System.out.println("Shift  : " + "13 ----------> because it is ROT3");
                System.out.println("Cipher : " + encryptROT13(text));

                System.out.println("------------------");
                break;
            }
            break;

        case "-d":
            System.out.println("You are in decipher mode");
            switch (args[secondElementOfArrayInArgsOfFunction]) {
            case "CEASAR":
                System.out.println("You are in Ceasar mode");
                intputedThirdAgument = Integer.parseInt(args[thirdElementOfArrayInArgsOfFunction]);
                System.out.println();

                // Input text
                System.out.println("Enter text to decrypt:");
                Scanner reader = new Scanner(System.in);
                textToDecrypt = reader.nextLine().toLowerCase();

                System.out.println("------------------");

                System.out.println("Decyphering");
                System.out.println("Text      : " + textToDecrypt);
                System.out.println("Shift     : " + intputedThirdAgument);
                System.out.println("Decipherd : " + decryptCeasar(textToDecrypt, intputedThirdAgument));

                System.out.println("------------------");
                break;
            case "ROT13":
                System.out.println("You are in ROT13 mode");
                System.out.println();

                // Input text
                System.out.println("Enter text to decrypt:");
                Scanner readerROT13 = new Scanner(System.in);
                textToDecrypt = readerROT13.nextLine().toLowerCase();

                System.out.println("------------------");

                System.out.println("Cyphering...");
                System.out.println("Text   : " + textToDecrypt);
                System.out.println("Shift  : " + "13 ----------> because it is ROT3");
                System.out.println("Cipher : " + decryptROT13(textToDecrypt));

                System.out.println("------------------");
                break;
            }
            break;
        }

    }
}