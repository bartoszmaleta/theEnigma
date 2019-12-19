package enigmaAppInOneClass;

import java.util.Scanner;
import java.util.concurrent.TimeUnit; // time.sleep() ===> maybe in future
import enigmaAppInOneClass.*; // does not compile other classes

/**
 * 
 * // Comment test to test branch default on github
 * TODO: 
 *  - Change switch to "if else"
 *  - Add to ceasar cipher recognition of " "           ASAP
 *  - Polybius Square Cipher                            ASAP
 *  - Loading BAR                                       ASAP
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
    static String text;
    static String textToDecrypt;

    static int firstElementOfArrayInArgsOfFunction = 0;
    static int secondElementOfArrayInArgsOfFunction = 1;
    static int thirdElementOfArrayInArgsOfFunction = 2;

    public static void printAllCiphers() {
        // TODO:
    }

    // ------------- CEASAR'S CIPHER METHODS START -------------
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

    // -------------- CEASAR'S CIPHER METHODS END --------------
    // ---------------------------------------------------------
    // -------------- ROT13 CIPHER METHODS START --------------
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

    // -------------- ROT13 CIPHER METHODS END --------------
    // ---------------------------------------------------------
    // ------------ MORSE EN-CIPHER METHODS START ------------
    public static String stringConvertToMorse(String userString) {
        String currentChar;
        String getMorseChar;
        String convertedString = "";

        for (int i = 0; i < userString.length(); i++) {

            currentChar = userString.charAt(i) + "";

            getMorseChar = convert(currentChar);

            if (getMorseChar.equals(" ")) {
                convertedString = convertedString + "  |  ";
            } else {
                convertedString = convertedString + getMorseChar;

                if (!getMorseChar.equals(" ")) {
                    convertedString = convertedString + " ";
                }
            }
        }

        return convertedString;
    }

    public static String convert(String charToMorse) {
        String morse = charToMorse;

        if (charToMorse.equalsIgnoreCase("a"))
            morse = ".-";
        if (charToMorse.equalsIgnoreCase("b"))
            morse = "-...";
        if (charToMorse.equalsIgnoreCase("c"))
            morse = "-.-.";
        if (charToMorse.equalsIgnoreCase("d"))
            morse = "-..";
        if (charToMorse.equalsIgnoreCase("e"))
            morse = ".";
        if (charToMorse.equalsIgnoreCase("f"))
            morse = "..-.";
        if (charToMorse.equalsIgnoreCase("g"))
            morse = "--.";
        if (charToMorse.equalsIgnoreCase("h"))
            morse = "....";
        if (charToMorse.equalsIgnoreCase("i"))
            morse = "..";
        if (charToMorse.equalsIgnoreCase("j"))
            morse = ".---";
        if (charToMorse.equalsIgnoreCase("k"))
            morse = "-.-";
        if (charToMorse.equalsIgnoreCase("l"))
            morse = ".-..";
        if (charToMorse.equalsIgnoreCase("m"))
            morse = "--";
        if (charToMorse.equalsIgnoreCase("n"))
            morse = "-.";
        if (charToMorse.equalsIgnoreCase("o"))
            morse = "---";
        if (charToMorse.equalsIgnoreCase("p"))
            morse = ".--.";
        if (charToMorse.equalsIgnoreCase("q"))
            morse = "--.-";
        if (charToMorse.equalsIgnoreCase("r"))
            morse = ".-.";
        if (charToMorse.equalsIgnoreCase("s"))
            morse = "...";
        if (charToMorse.equalsIgnoreCase("t"))
            morse = "-";
        if (charToMorse.equalsIgnoreCase("u"))
            morse = "..-";
        if (charToMorse.equalsIgnoreCase("v"))
            morse = "...-";
        if (charToMorse.equalsIgnoreCase("w"))
            morse = ".--";
        if (charToMorse.equalsIgnoreCase("x"))
            morse = "-..-";
        if (charToMorse.equalsIgnoreCase("y"))
            morse = "-.--";
        if (charToMorse.equalsIgnoreCase("z"))
            morse = "--..";
        if (charToMorse.equalsIgnoreCase("0"))
            morse = "-----";
        if (charToMorse.equalsIgnoreCase("1"))
            morse = ".----";
        if (charToMorse.equalsIgnoreCase("2"))
            morse = "..---";
        if (charToMorse.equalsIgnoreCase("3"))
            morse = "...--";
        if (charToMorse.equalsIgnoreCase("4"))
            morse = "....-";
        if (charToMorse.equalsIgnoreCase("5"))
            morse = ".....";
        if (charToMorse.equalsIgnoreCase("6"))
            morse = "-....";
        if (charToMorse.equalsIgnoreCase("7"))
            morse = "--...";
        if (charToMorse.equalsIgnoreCase("8"))
            morse = "---..";
        if (charToMorse.equalsIgnoreCase("9"))
            morse = "----.";
        if (charToMorse.equalsIgnoreCase("."))
            morse = ".-.-";
        if (charToMorse.equalsIgnoreCase(","))
            morse = "--..--";
        if (charToMorse.equalsIgnoreCase("?"))
            morse = "..--..";

        return morse;
    }

    // ------------ MORSE EN-CIPHER METHODS END ------------
    // ---------------------------------------------------------
    // ------------ MORSE DE-CIPHER METHODS START ------------
    public static String morseConvertToString(String userString) {
        String currentMorseChar;
        String getStringChar;
        String convertedMorse = "";

        for (int i = 0; i < userString.length(); i++) {

            currentMorseChar = userString.charAt(i) + "";

            getStringChar = convert(currentMorseChar);

            if (getStringChar.equals(" ")) {
                convertedMorse = convertedMorse + "  |  ";
            } else {
                convertedMorse = convertedMorse + getStringChar;

                if (!getStringChar.equals(" ")) {
                    convertedMorse = convertedMorse + " ";
                }
            }
        }

        return convertedMorse;
    }

    public static String convertMorseToChar(String morseToChar) {
        String characterConverted = morseToChar;

        if (morseToChar.equalsIgnoreCase(".-"))
            characterConverted = "a";
        if (morseToChar.equalsIgnoreCase("-..."))
            characterConverted = "b";
        if (morseToChar.equalsIgnoreCase("-.-."))
            characterConverted = "c";
        if (morseToChar.equalsIgnoreCase("-.."))
            characterConverted = "d";
        if (morseToChar.equalsIgnoreCase("."))
            characterConverted = "e";
        if (morseToChar.equalsIgnoreCase("..-."))
            characterConverted = "f";
        if (morseToChar.equalsIgnoreCase("--."))
            characterConverted = "g";
        if (morseToChar.equalsIgnoreCase("...."))
            characterConverted = "h";
        if (morseToChar.equalsIgnoreCase(".."))
            characterConverted = "i";
        if (morseToChar.equalsIgnoreCase(".---"))
            characterConverted = "j";
        if (morseToChar.equalsIgnoreCase("-.-"))
            characterConverted = "k";
        if (morseToChar.equalsIgnoreCase(".-.."))
            characterConverted = "l";
        if (morseToChar.equalsIgnoreCase("--"))
            characterConverted = "m";
        if (morseToChar.equalsIgnoreCase("-."))
            characterConverted = "n";
        if (morseToChar.equalsIgnoreCase("---"))
            characterConverted = "o";
        if (morseToChar.equalsIgnoreCase(".--."))
            characterConverted = "p";
        if (morseToChar.equalsIgnoreCase("--.-"))
            characterConverted = "q";
        if (morseToChar.equalsIgnoreCase(".-."))
            characterConverted = "r";
        if (morseToChar.equalsIgnoreCase("..."))
            characterConverted = "s";
        if (morseToChar.equalsIgnoreCase("-"))
            characterConverted = "t";
        if (morseToChar.equalsIgnoreCase("..-"))
            characterConverted = "u";
        if (morseToChar.equalsIgnoreCase("...-"))
            characterConverted = "v";
        if (morseToChar.equalsIgnoreCase(".--"))
            characterConverted = "w";
        if (morseToChar.equalsIgnoreCase("-..-"))
            characterConverted = "x";
        if (morseToChar.equalsIgnoreCase("-.--"))
            characterConverted = "y";
        if (morseToChar.equalsIgnoreCase("--.."))
            characterConverted = "z";
        if (morseToChar.equalsIgnoreCase("-----"))
            characterConverted = "0";
        if (morseToChar.equalsIgnoreCase(".----"))
            characterConverted = "1";
        if (morseToChar.equalsIgnoreCase("..---"))
            characterConverted = "2";
        if (morseToChar.equalsIgnoreCase("...--"))
            characterConverted = "3";
        if (morseToChar.equalsIgnoreCase("....-"))
            characterConverted = "4";
        if (morseToChar.equalsIgnoreCase("....."))
            characterConverted = "5";
        if (morseToChar.equalsIgnoreCase("-...."))
            characterConverted = "6";
        if (morseToChar.equalsIgnoreCase("--..."))
            characterConverted = "7";
        if (morseToChar.equalsIgnoreCase("---.."))
            characterConverted = "8";
        if (morseToChar.equalsIgnoreCase("----."))
            characterConverted = "9";
        if (morseToChar.equalsIgnoreCase(".-.-"))
            characterConverted = ".";
        if (morseToChar.equalsIgnoreCase("--..--"))
            characterConverted = ",";
        if (morseToChar.equalsIgnoreCase("..--.."))
            characterConverted = "?";

        return characterConverted;
    }
    // ------------ MORSE EN-CIPHER METHODS END ------------
    // ---------------------------------------------------------

    // ------------ MAIN ------------

    public static void main(String[] args) throws Exception {

        System.out.println("ENIGMA");
        int intputedThirdAgument;

        System.out.println();
        System.out.println("Your first argument of application is: " + args[firstElementOfArrayInArgsOfFunction]);
        System.out.println("------------------");
        System.out.println();

        switch (args[firstElementOfArrayInArgsOfFunction]) {
        case "-l":
        // PROGRESS BAR ------ START ------
            System.out.print("\033[H\033[2J");
            System.out.flush();
            for (int i = 0; i <= 200; i = i + 20) {
                progressPercentage(i, 200);
                try {
                    Thread.sleep(400);

                } catch (Exception e) {
                }
            }
        // PROGRESS BAR ------ END ------

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
            case "MORSE":
                System.out.println("You are in MORSE mode");
                System.out.println();

                // Input text
                System.out.println("Enter text to encrypt:");
                Scanner readerMorse = new Scanner(System.in);
                text = readerMorse.nextLine().toLowerCase();

                System.out.println("------------------");

                System.out.println("Cyphering...");
                System.out.println("Text   : " + text);
                System.out.println(stringConvertToMorse((text)));

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
            case "MORSE": // DOES NOT WORK, BECAUSE CANT KNOW WHEN STRING/CHARACTER ENDS
                System.out.println("You are in MORSE mode");
                System.out.println();

                // Input text
                System.out.println("Enter text to decrypt:");
                Scanner readerMorse = new Scanner(System.in);
                String textInMorse = readerMorse.nextLine().toLowerCase();

                System.out.println("------------------");

                System.out.println("Cyphering...");
                System.out.println("Text   : " + textInMorse);
                System.out.println(morseConvertToString(textInMorse));

                System.out.println("------------------");
                break;
            }
            break;
        }
    }

    // ------ PROGRESS BAR FUNCTION START ------ 
    public static void progressPercentage(int remain, int total) {
        if (remain > total) {
            throw new IllegalArgumentException();
        }
        int maxBareSize = 10; // 10unit for 100%
        int remainProcent = ((100 * remain) / total) / maxBareSize;
        char defaultChar = '-';
        String icon = "=";
        String bar = new String(new char[maxBareSize]).replace('\0', defaultChar) + "]";
        StringBuilder barDone = new StringBuilder();
        barDone.append("[");
        for (int i = 0; i < remainProcent; i++) {
            barDone.append(icon);
        }
        String barRemain = bar.substring(remainProcent, bar.length());
        System.out.print("\r" + barDone + barRemain + " " + remainProcent * 10 + "%");
        if (remain == total) {
            System.out.print("\n");
        }
    }
    // ------ PROGRESS BAR FUNCTION END ------ 

}