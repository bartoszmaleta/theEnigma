package enigmaAppInOneClass;

public class CeasarCipher {
    String textToEncipher = "ABCDE";

    public static void printbla() {

        System.out.println("balalal");

    }

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

    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("Cyphering");
        String text = "ATTACKATONCE";
        int s = 4;

        System.out.println("Text   : " + text);
        System.out.println("Shift  : " + s);
        System.out.println("Cipher : " + encrypt(text, s));

        System.out.println("------------------------------------");
        System.out.println("Decyphering");
        String textToDecrypt = "EXXEGOEXSRGI";
        int g = 4;
        System.out.println("Text      : " + textToDecrypt);
        System.out.println("Shift     : " + g);
        System.out.println("Decipherd : " + decrypt(textToDecrypt, g));

    }
}