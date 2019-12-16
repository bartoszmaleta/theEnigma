package enigmaAppInOneClass;

import java.util.Scanner;
import enigmaAppInOneClass.*;

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
        int fourthElementOfArrayInArgsOfFunction = 3;
        int fifthElementOfArrayInArgsOfFunction = 4;
        
        System.out.println("Welcome " + args[firstElementOfArrayInArgsOfFunction]);
        System.out.println("Your second argument of func is: " + args[secondElementOfArrayInArgsOfFunction ]);
        System.out.println("------------------");


        switch (args[thirdElementOfArrayInArgsOfFunction]) {
            case "-l":
                System.out.println("Show all implemented ciphers");
                break;
            case "-e":
                System.out.println("You are in encipher mode");
                switch (args[fourthElementOfArrayInArgsOfFunction]) {
                    case "CEASAR":

                        System.out.println("You are in Ceasar mode");
                        // CeasarCipher.printbla();     // dont know why it does not compile
                        // enigmaAppInOneClass.CeasarCipher.printbla();     // dont know why it does not compile
                    }
                break;
            case "-d":
                System.out.println("You are in decipher mode");
                break;
        }


    }
}