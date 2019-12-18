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