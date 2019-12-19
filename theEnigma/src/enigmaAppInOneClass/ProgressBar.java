// package enigmaAppInOneClass;

// public class ProgressBar {
//     // public static void progressing() {
//     // String importantInfo[] = { "[= ]", "[== ]", "[=== ]", "[==== ]", "[===== ]",
//     // "[====== ]", "[======= ]", "[======== ]", "[========= ]", "[==========]" };

//     // System.out.print("\033[H\033[2J");
//     // System.out.flush();
//     // // Thread.sleep(500);
//     // for (int i = 0; i < importantInfo.length; i++) {
//     // System.out.println();
//     // System.out.println();
//     // System.out.println();
//     // System.out.println();

//     // // Pause for 4 seconds
//     // // Print a message
//     // System.out.println(importantInfo[i]);
//     // // Thread.sleep(200);
//     // System.out.print("\033[H\033[2J");
//     // System.out.flush();
//     // }
//     // }

//     public static void main(String args[]) throws InterruptedException {
//         // String importantInfo[] = { "[= ]", "[== ]", "[=== ]", "[==== ]", "[===== ]",
//         // "[====== ]", "[======= ]", "[======== ]", "[========= ]", "[==========]" };

//         // System.out.print("\033[H\033[2J");
//         // System.out.flush();
//         // Thread.sleep(500);
//         // for (int i = 0; i < importantInfo.length; i++) {
//         // System.out.println();
//         // System.out.println();
//         // System.out.println();
//         // System.out.println();

//         // // Pause for 4 seconds
//         // // Print a message
//         // System.out.println(importantInfo[i]);
//         // Thread.sleep(200);
//         // System.out.print("\033[H\033[2J");
//         // System.out.flush();

//         // IN ONE ONE PLACE!!!

//         // char[] animationChars = new char[]{'|', '/', '-', '\\'};

//         // for (int i = 0; i <= 100; i++) {
//         // System.out.print("Processing: " + i + "% " + animationChars[i % 4] + "\r");

//         // try {
//         // Thread.sleep(100);
//         // } catch (InterruptedException e) {
//         // e.printStackTrace();
//         // }
//         // }

//         // System.out.println("Processing: Done! ");
//         System.out.print("\033[H\033[2J");
//         System.out.flush();
//         for (int i = 0; i <= 100; i = i + 10) {
//             progressPercentage(i, 100);
//             try {
//                 Thread.sleep(400);

//             } catch (Exception e) {
//             }
//         }
//     }

//     public static void progressPercentage(int remain, int total) {
//         if (remain > total) {
//             throw new IllegalArgumentException();
//         }
//         int maxBareSize = 10; // 10unit for 100%
//         int remainProcent = ((100 * remain) / total) / maxBareSize;
//         char defaultChar = '-';
//         String icon = "=";
//         String bar = new String(new char[maxBareSize]).replace('\0', defaultChar) + "]";
//         StringBuilder barDone = new StringBuilder();
//         barDone.append("[");
//         for (int i = 0; i < remainProcent; i++) {
//             barDone.append(icon);
//         }
//         String barRemain = bar.substring(remainProcent, bar.length());
//         System.out.print("\r" + barDone + barRemain + " " + remainProcent * 10 + "%");
//         if (remain == total) {
//             System.out.print("\n");
//         }
//     }
// }