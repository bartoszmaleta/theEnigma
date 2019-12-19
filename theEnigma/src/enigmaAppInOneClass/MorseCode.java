// package enigmaAppInOneClass;

// import java.util.*;

// public class MorseCode 
// {


// public static void main(String[] args) 
// {

//     Scanner userInput = new Scanner(System.in); 
//     System.out.println("Please enter a phrase to convert to morse code: ");
//     String userString = userInput.nextLine();
//     System.out.println("");
//     System.out.println(stringConvert(userString));
// }


// public static String stringConvert(String userString)
// {
//     String currentChar;
//     String getMorseChar;
//     String convertedString = "";

//     for (int i = 0; i < userString.length(); i++)
//     {
//         //Get character at i position
//         currentChar = userString.charAt(i) + "";  

//         //convert character to morse code
//         getMorseChar = convert(currentChar);

//         //seperate words with the | symbol
//         if (getMorseChar.equals(" "))
//         {
//             convertedString = convertedString + "  |  ";
//         } 

//         else 
//         {
//             //concat the converted letter
//             convertedString = convertedString + getMorseChar;

//             //Add a space between each letter
//             if (!getMorseChar.equals(" ")) 
//             {
//                 convertedString = convertedString + " ";
//             }   
//         }           
//     }

//     return convertedString;

// }
//  public static String convert (String toEncode)  
//     {  
//         String morse = toEncode;  

//         if (toEncode.equalsIgnoreCase("a"))  
//             morse = ".-";  
//         if (toEncode.equalsIgnoreCase("b"))  
//             morse = "-...";  
//         if (toEncode.equalsIgnoreCase("c"))  
//             morse = "-.-.";  
//         if (toEncode.equalsIgnoreCase("d"))  
//             morse = "-..";  
//         if (toEncode.equalsIgnoreCase("e"))  
//             morse = ".";  
//         if (toEncode.equalsIgnoreCase("f"))  
//             morse = "..-.";  
//         if (toEncode.equalsIgnoreCase("g"))  
//             morse = "--.";  
//         if (toEncode.equalsIgnoreCase("h"))  
//             morse = "....";  
//         if (toEncode.equalsIgnoreCase("i"))  
//             morse = "..";  
//         if (toEncode.equalsIgnoreCase("j"))  
//             morse = ".---";  
//         if (toEncode.equalsIgnoreCase("k"))  
//             morse = "-.-";  
//         if (toEncode.equalsIgnoreCase("l"))  
//             morse = ".-..";  
//         if (toEncode.equalsIgnoreCase("m"))  
//             morse = "--";  
//         if (toEncode.equalsIgnoreCase("n"))  
//             morse = "-.";  
//         if (toEncode.equalsIgnoreCase("o"))  
//             morse = "---";  
//         if (toEncode.equalsIgnoreCase("p"))  
//             morse = ".--.";  
//         if (toEncode.equalsIgnoreCase("q"))  
//             morse = "--.-";  
//         if (toEncode.equalsIgnoreCase("r"))  
//             morse = ".-.";  
//         if (toEncode.equalsIgnoreCase("s"))  
//             morse = "...";  
//         if (toEncode.equalsIgnoreCase("t"))  
//             morse = "-";  
//         if (toEncode.equalsIgnoreCase("u"))  
//             morse = "..-";  
//         if (toEncode.equalsIgnoreCase("v"))  
//             morse = "...-";  
//         if (toEncode.equalsIgnoreCase("w"))  
//             morse = ".--";  
//         if (toEncode.equalsIgnoreCase("x"))  
//             morse = "-..-";  
//         if (toEncode.equalsIgnoreCase("y"))  
//             morse = "-.--";  
//         if (toEncode.equalsIgnoreCase("z"))  
//             morse = "--..";  
//         if (toEncode.equalsIgnoreCase("0"))  
//             morse = "-----";  
//         if (toEncode.equalsIgnoreCase("1"))  
//             morse = ".----";  
//         if (toEncode.equalsIgnoreCase("2"))  
//             morse = "..---";  
//         if (toEncode.equalsIgnoreCase("3"))  
//             morse = "...--";  
//         if (toEncode.equalsIgnoreCase("4"))  
//             morse = "....-";  
//         if (toEncode.equalsIgnoreCase("5"))  
//             morse = ".....";  
//         if (toEncode.equalsIgnoreCase("6"))  
//             morse = "-....";  
//         if (toEncode.equalsIgnoreCase("7"))  
//             morse = "--...";  
//         if (toEncode.equalsIgnoreCase("8"))  
//             morse = "---..";  
//         if (toEncode.equalsIgnoreCase("9"))  
//             morse = "----.";  
//         if (toEncode.equalsIgnoreCase("."))  
//             morse = ".-.-";  
//         if (toEncode.equalsIgnoreCase(","))  
//             morse = "--..--";  
//         if (toEncode.equalsIgnoreCase("?"))  
//             morse = "..--..";  

//         return morse;  
//     }  

//  }



// WRONG VERSION OF DECIPHER!!!!!!!! 

    // // ------------ MORSE DE-CIPHER METHODS START ------------
    // public static String morseConvertToString(String userString) {
    //     String currentMorseChar;
    //     String getStringChar;
    //     String convertedMorse = "";

    //     for (int i = 0; i < userString.length(); i++) {

    //         currentMorseChar = userString.charAt(i) + "";

    //         getStringChar = convert(currentMorseChar);

    //         if (getStringChar.equals(" ")) {
    //             convertedMorse = convertedMorse + "  |  ";
    //         } else {
    //             convertedMorse = convertedMorse + getStringChar;

    //             if (!getStringChar.equals(" ")) {
    //                 convertedMorse = convertedMorse + " ";
    //             }
    //         }
    //     }

    //     return convertedMorse;
    // }

    // public static String convertMorseToChar(String morseToChar) {
    //     String characterConverted = morseToChar;

    //     if (morseToChar.equalsIgnoreCase(".-"))
    //         characterConverted = "a";
    //     if (morseToChar.equalsIgnoreCase("-..."))
    //         characterConverted = "b";
    //     if (morseToChar.equalsIgnoreCase("-.-."))
    //         characterConverted = "c";
    //     if (morseToChar.equalsIgnoreCase("-.."))
    //         characterConverted = "d";
    //     if (morseToChar.equalsIgnoreCase("."))
    //         characterConverted = "e";
    //     if (morseToChar.equalsIgnoreCase("..-."))
    //         characterConverted = "f";
    //     if (morseToChar.equalsIgnoreCase("--."))
    //         characterConverted = "g";
    //     if (morseToChar.equalsIgnoreCase("...."))
    //         characterConverted = "h";
    //     if (morseToChar.equalsIgnoreCase(".."))
    //         characterConverted = "i";
    //     if (morseToChar.equalsIgnoreCase(".---"))
    //         characterConverted = "j";
    //     if (morseToChar.equalsIgnoreCase("-.-"))
    //         characterConverted = "k";
    //     if (morseToChar.equalsIgnoreCase(".-.."))
    //         characterConverted = "l";
    //     if (morseToChar.equalsIgnoreCase("--"))
    //         characterConverted = "m";
    //     if (morseToChar.equalsIgnoreCase("-."))
    //         characterConverted = "n";
    //     if (morseToChar.equalsIgnoreCase("---"))
    //         characterConverted = "o";
    //     if (morseToChar.equalsIgnoreCase(".--."))
    //         characterConverted = "p";
    //     if (morseToChar.equalsIgnoreCase("--.-"))
    //         characterConverted = "q";
    //     if (morseToChar.equalsIgnoreCase(".-."))
    //         characterConverted = "r";
    //     if (morseToChar.equalsIgnoreCase("..."))
    //         characterConverted = "s";
    //     if (morseToChar.equalsIgnoreCase("-"))
    //         characterConverted = "t";
    //     if (morseToChar.equalsIgnoreCase("..-"))
    //         characterConverted = "u";
    //     if (morseToChar.equalsIgnoreCase("...-"))
    //         characterConverted = "v";
    //     if (morseToChar.equalsIgnoreCase(".--"))
    //         characterConverted = "w";
    //     if (morseToChar.equalsIgnoreCase("-..-"))
    //         characterConverted = "x";
    //     if (morseToChar.equalsIgnoreCase("-.--"))
    //         characterConverted = "y";
    //     if (morseToChar.equalsIgnoreCase("--.."))
    //         characterConverted = "z";
    //     if (morseToChar.equalsIgnoreCase("-----"))
    //         characterConverted = "0";
    //     if (morseToChar.equalsIgnoreCase(".----"))
    //         characterConverted = "1";
    //     if (morseToChar.equalsIgnoreCase("..---"))
    //         characterConverted = "2";
    //     if (morseToChar.equalsIgnoreCase("...--"))
    //         characterConverted = "3";
    //     if (morseToChar.equalsIgnoreCase("....-"))
    //         characterConverted = "4";
    //     if (morseToChar.equalsIgnoreCase("....."))
    //         characterConverted = "5";
    //     if (morseToChar.equalsIgnoreCase("-...."))
    //         characterConverted = "6";
    //     if (morseToChar.equalsIgnoreCase("--..."))
    //         characterConverted = "7";
    //     if (morseToChar.equalsIgnoreCase("---.."))
    //         characterConverted = "8";
    //     if (morseToChar.equalsIgnoreCase("----."))
    //         characterConverted = "9";
    //     if (morseToChar.equalsIgnoreCase(".-.-"))
    //         characterConverted = ".";
    //     if (morseToChar.equalsIgnoreCase("--..--"))
    //         characterConverted = ",";
    //     if (morseToChar.equalsIgnoreCase("..--.."))
    //         characterConverted = "?";

    //     return characterConverted;
    // }
    // // ------------ MORSE EN-CIPHER METHODS END ------------