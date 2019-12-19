package enigmaAppInOneClass;
import java.util.Scanner;

public class Atbash {
    

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

    public static void main(String[] args) {
        Scanner inputFromUser = new Scanner(System.in);

        System.out.println("\nEnter your message to encrypt: ");
        String msgToEncrypt = inputFromUser.nextLine();
        msgToEncrypt = msgToEncrypt.toLowerCase();

        System.out.println("------------------------------------");
        System.out.println("Cyphering");        
        System.out.println("Ciphered: " + atbashEncrypt(msgToEncrypt));

        System.out.println("\nEnter your message to decrypt: ");
        msgToEncrypt = inputFromUser.nextLine();
        msgToEncrypt = msgToEncrypt.toLowerCase();

        System.out.println("------------------------------------");
        System.out.println("Decyphering");
        System.out.println("Decipherd : " + atbashDecrypt(msgToEncrypt));

    }
}