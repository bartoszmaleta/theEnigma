package enigmaAppInOneClass;

import java.util.Scanner;

// ------------- CEASAR'S CIPHER METHODS START -------------
public class CeasarCipher2 {

    public static StringBuffer encryptCeasar(String text, int keyNumber) {
        StringBuffer result = new StringBuffer();
        keyNumber = keyNumber + 1;

        for (int i = 0; i < text.length(); i++) {
            // if (Character.isSpaceChar(text.charAt(i))) {
            //     result.append(" ");
            // }
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + keyNumber - 65) % 26 + 65);
                result.append(ch);
            } else {
                if (Character.isSpaceChar(text.charAt(i))) {
                    result.append(" ");
                } else {
                    char ch = (char) (((int) text.charAt(i) + keyNumber - 96) % 26 + 96);
                    result.append(ch);
                }
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
                char ch = (char) (((int) text.charAt(i) + keyNumber - 96) % 26 + 96);
                result.append(ch);
            }
        }
        return result;
    }

    // -------------- CEASAR'S CIPHER METHODS END --------------
    // ---------------------------------------------------------
    public static void main(String[] args) {
        int shift = 4;

        System.out.println("You are in Ceasar mode");
        // intputedThirdAgument =
        // Integer.parseInt(args[thirdElementOfArrayInArgsOfFunction]);
        System.out.println();

        // Input text
        System.out.println("Enter text to encrypt:");
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine().toLowerCase();

        System.out.println("------------------");
        System.out.println();

        System.out.println("Text   : " + text);
        System.out.println("Shift  : " + shift);
        System.out.println("Cipher : " + encryptCeasar(text, shift));

        System.out.println();
        System.out.println("------------------");

    }
}