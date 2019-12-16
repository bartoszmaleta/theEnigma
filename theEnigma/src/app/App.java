package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
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