package enigmaAppInOneClass;

/**
 * 
 * Remember about changing to another branch !!!!!!!!!!!!! Don't work on branch
 * Development and Master!!!!!!!!!!!!!
 * 
 */

/** To run option three write in terminal:
 * >>>>>>>>>>> java Enigma.java <firstArgument> <secondArgument> -l <<<<<<<<<<<<<<<
   for example:
   java Enigma.java Bartosz Maleta -l

 */

public class Enigma {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        int firstElementOfArrayInArgsOfFunction = 0;
        int secondElementOfArrayInArgsOfFunction = 1;
        int thirdElementOfArrayInArgsOfFunction = 2;
        
        System.out.println("Welcome " + args[firstElementOfArrayInArgsOfFunction]);
        System.out.println("Your second argument of func is: " + args[secondElementOfArrayInArgsOfFunction ]);
        System.out.println("------------------");


        switch (args[thirdElementOfArrayInArgsOfFunction]) {
            case "-l":
                System.out.println("Show all implemented ciphers");
                break;
            case "-e":
                System.out.println("You are in ecipher mode");
                break;
            case "-d":
                System.out.println("You are in decipher mode");
                break;
        }


    }
}