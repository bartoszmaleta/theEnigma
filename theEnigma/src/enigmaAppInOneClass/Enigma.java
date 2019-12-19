package enigmaAppInOneClass;

import java.util.Scanner;
import java.util.concurrent.TimeUnit; // time.sleep() ===> maybe in future
import enigmaAppInOneClass.*; // does not compile other classes

/**
 * 
 * // Comment test to test branch default on github
 * TODO: 
 *  - Change switch to "if else"
 *  - Add to ceasar cipher recognition of " "           DONE
 *  - Polybius Square Cipher                            ASAP
 *  - Loading BAR                                       DONE
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

    static int numberOfBlankLines;

    public static void printAllCiphers() {
        // TODO:
    }

    // ------------- CEASAR'S CIPHER METHODS START -------------
    public static StringBuffer encryptCeasar(String text, int keyNumber) {
        StringBuffer result = new StringBuffer();
        keyNumber = keyNumber + 1;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + keyNumber - 65) % 26 + 65);
                result.append(ch);
            } else {
                if (Character.isSpaceChar(text.charAt(i))) {
                    result.append(" ");
                } else {
                char ch = (char) (((int) text.charAt(i) + keyNumber - 96) % 26 + 96);
                result.append(ch); }
            }
        }
        return result;
    }

    public static StringBuffer decryptCeasar(String text, int keyNumber) {
        // keyNumber = -keyNumber + 2;
        keyNumber = 26 - keyNumber - 1;
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + keyNumber - 65) % 26 + 65);
                result.append(ch);
            } else {
                if (Character.isSpaceChar(text.charAt(i))) {
                    result.append(" ");
                } else {
                char ch = (char) (((int) text.charAt(i) + keyNumber - 96) % 26 + 96);
                result.append(ch); }
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
                if (Character.isSpaceChar(text.charAt(i))) {
                    result.append(" ");
                } else {
                char ch = (char) (((int) text.charAt(i) + keyNumberForROT13 - 96) % 26 + 96);
                result.append(ch); }
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
                if (Character.isSpaceChar(text.charAt(i))) {
                    result.append(" ");
                } else {
                char ch = (char) (((int) text.charAt(i) + keyNumberForROT13 - 96) % 26 + 96);
                result.append(ch); }
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
    // ------------ MORSE DE-CIPHER METHODS START ------------
    // TODO:
    // ------------ MORSE DE-CIPHER METHODS END ------------
    // ---------------------------------------------------------
    // ------------ ATBASH EN-CIPHER METHODS START ------------

    public static String atbashEncrypt(String msgToEncrypt) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String reversedAlphabet = "";
        String encryptedMsg = "";

        for (int i = alphabet.length() - 1; i >= 0; i--) {
            reversedAlphabet = reversedAlphabet + alphabet.charAt(i);
        }

        for (int i = 0; i < msgToEncrypt.length(); i++) {
            if (msgToEncrypt.charAt(i) == (char) 32) {
                encryptedMsg += " ";
            } else {
                for (int j = 0; j < alphabet.length(); j++) {
                    if (msgToEncrypt.charAt(i) == alphabet.charAt(j)) {
                        encryptedMsg += reversedAlphabet.charAt(j);
                        break;
                    }
                }
            }
        }

        return encryptedMsg;
    }

    // ------------ ATBASH EN-CIPHER METHODS END ------------
    // ------------ ATBASH DE-CIPHER METHODS START ------------

    public static String atbashDecrypt(String msgToEncrypt) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String reversedAlphabet = "";
        String decryptedMsg = "";

        for (int i = alphabet.length() - 1; i >= 0; i--) {
            reversedAlphabet = reversedAlphabet + alphabet.charAt(i);
        }

        for (int i = 0; i < msgToEncrypt.length(); i++) {
            if (msgToEncrypt.charAt(i) == (char) 32) {
                decryptedMsg += " ";
            } else {
                for (int j = 0; j < reversedAlphabet.length(); j++) {
                    if (msgToEncrypt.charAt(i) == reversedAlphabet.charAt(j)) {
                        decryptedMsg += alphabet.charAt(j);
                        break;
                    }
                }
            }
        }
        return decryptedMsg;
    }

    // ------------ ATBASH DE-CIPHER METHODS END ------------
    // ---------------------------------------------------------
    // ------------ MAIN ------------

    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();

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
            System.out.println("1. CEASAR => (Enter in termina:    'java Enigma.java -e CEASAR 4' to turn on application.");
            System.out.println("2. ROT13 => (Enter in terminal:    'java Enigma.java -e ROT13' to turn on application.");
            System.out.println("3. ATBASH => (Enter in terminal:   'java Enigma.java -e ATBASH' to turn on application.");
            System.out.println("4. MORSE => (Enter in terminal:    'java Enigma.java -e MORSE' to turn on application.");

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


                // PROGRESS BAR ------ START ------
                for (int i = 0; i <= 200; i = i + 20) {


                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    blankLines(7);
                    System.out.println("Cyphering");
                    progressPercentage(i, 200);
                    try {
                        Thread.sleep(400);

                    } catch (Exception e) {
                    }
                }
                // PROGRESS BAR ------ END ------
                System.out.println("------------------");
                System.out.println();

                System.out.println("Text   : " + text);
                System.out.println("Shift  : " + intputedThirdAgument);
                System.out.println("Cipher : " + encryptCeasar(text, intputedThirdAgument));

                System.out.println();
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


                // PROGRESS BAR ------ START ------
                for (int i = 0; i <= 200; i = i + 20) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    blankLines(7);
                    System.out.println("Cyphering");
                    progressPercentage(i, 200);
                    try {
                        Thread.sleep(400);

                    } catch (Exception e) {
                    }
                }
                // PROGRESS BAR ------ END ------
                System.out.println("------------------");
                System.out.println();

                System.out.println("Text   : " + text);
                System.out.println("Shift  : " + "13 ----------> because it is ROT3");
                System.out.println("Cipher : " + encryptROT13(text));

                System.out.println();
                System.out.println("------------------");
                break;
            case "MORSE":
                System.out.println("You are in MORSE mode");
                System.out.println();

                // Input text
                System.out.println("Enter text to encrypt:");
                Scanner readerMorse = new Scanner(System.in);
                text = readerMorse.nextLine().toLowerCase();

                // PROGRESS BAR ------ START ------
                for (int i = 0; i <= 200; i = i + 20) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    blankLines(7);
                    System.out.println("Cyphering");
                    progressPercentage(i, 200);
                    try {
                        Thread.sleep(400);

                    } catch (Exception e) {
                    }
                }
                // PROGRESS BAR ------ END ------
                System.out.println("------------------");
                System.out.println();

                System.out.println("Text     : " + text);
                System.out.println("Ciphered : " + stringConvertToMorse((text)));

                System.out.println();
                System.out.println("------------------");
                break;
            case "ATBASH":
                System.out.println("You are in ATBASH mode");
                Scanner inputFromUser = new Scanner(System.in);

                System.out.println("\nEnter your message to encrypt: ");
                String msgToEncrypt = inputFromUser.nextLine();
                msgToEncrypt = msgToEncrypt.toLowerCase();

                // PROGRESS BAR ------ START ------
                for (int i = 0; i <= 200; i = i + 20) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    blankLines(7);
                    System.out.println("Cyphering");
                    progressPercentage(i, 200);
                    try {
                        Thread.sleep(400);

                    } catch (Exception e) {
                    }
                }
                // PROGRESS BAR ------ END ------
                System.out.println("------------------");

                System.out.println();

                System.out.println("Text     : " + msgToEncrypt);
                System.out.println("Ciphered : " + atbashEncrypt(msgToEncrypt));

                System.out.println();
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

                // PROGRESS BAR ------ START ------
                for (int i = 0; i <= 200; i = i + 20) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    blankLines(7);
                    System.out.println("Decyphering");
                    progressPercentage(i, 200);
                    try {
                        Thread.sleep(400);

                    } catch (Exception e) {
                    }
                }
                // PROGRESS BAR ------ END ------
                System.out.println("------------------");
                System.out.println();

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

                // PROGRESS BAR ------ START ------
                for (int i = 0; i <= 200; i = i + 20) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    blankLines(7);
                    System.out.println("Decyphering");
                    progressPercentage(i, 200);
                    try {
                        Thread.sleep(400);

                    } catch (Exception e) {
                    }
                }
                // PROGRESS BAR ------ END ------
                System.out.println("------------------");
                System.out.println();

                System.out.println("Text   : " + textToDecrypt);
                System.out.println("Shift  : " + "13 ----------> because it is ROT3");
                System.out.println("Cipher : " + decryptROT13(textToDecrypt));

                System.out.println();
                System.out.println("------------------");
                break;
            case "MORSE": // DOES NOT WORK, BECAUSE CANT KNOW WHEN STRING/CHARACTER ENDS
                System.out.println("You are in MORSE mode");
                System.out.println();

                // Input text
                System.out.println("Enter text to decrypt:");
                Scanner readerMorse = new Scanner(System.in);
                String textInMorse = readerMorse.nextLine().toLowerCase();

                // PROGRESS BAR ------ START ------
                for (int i = 0; i <= 200; i = i + 20) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    blankLines(7);
                    System.out.println("Decyphering");
                    progressPercentage(i, 200);
                    try {
                        Thread.sleep(400);

                    } catch (Exception e) {
                    }
                }
                // PROGRESS BAR ------ END ------
                System.out.println("------------------");
                System.out.println();

                System.out.println("Text   : " + textInMorse);
                // System.out.println(morseConvertToString(textInMorse));           # DOES NOT WORK

                System.out.println();
                System.out.println("------------------");
                break;
            case "ATBASH":
                Scanner inputFromUser = new Scanner(System.in);
                System.out.println("\nEnter your message to decrypt: ");
                String msgToDecrypt = inputFromUser.nextLine();
                msgToDecrypt = msgToDecrypt.toLowerCase();

                // PROGRESS BAR ------ START ------
                for (int i = 0; i <= 200; i = i + 20) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    blankLines(7);
                    System.out.println("Decyphering");
                    progressPercentage(i, 200);
                    try {
                        Thread.sleep(400);

                    } catch (Exception e) {
                    }
                }
                // PROGRESS BAR ------ END ------
                System.out.println("------------------");
                System.out.println();

                System.out.println("Text   : " + msgToDecrypt);
                System.out.println("Decipherd : " + atbashDecrypt(msgToDecrypt));

                System.out.println();
                System.out.println("------------------");

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
    // Implementing
    // ------ BLANK LINES ------
    public static void blankLines(int numberOfBlankLines) {
        StringBuffer result = new StringBuffer();
       
        for (int i = 1; i < numberOfBlankLines; i++) {
            String blankLine = "\n";
            result.append(blankLine);
        }
        System.out.println(result);
        // return result;
    
    }
}