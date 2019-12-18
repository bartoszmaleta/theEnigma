package enigmaAppInOneClass;

public class ProgressBar {
    public static void progressing() {
        String importantInfo[] = { "[=         ]", "[==        ]", "[===       ]", "[====      ]", "[=====     ]",
                "[======    ]", "[=======   ]", "[========  ]", "[========= ]", "[==========]" };

        System.out.print("\033[H\033[2J");
        System.out.flush();
        // Thread.sleep(500);
        for (int i = 0; i < importantInfo.length; i++) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            // Pause for 4 seconds
            // Print a message
            System.out.println(importantInfo[i]);
            // Thread.sleep(200);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    public static void main(String args[]) throws InterruptedException {
        // String importantInfo[] = { "[= ]", "[== ]", "[=== ]", "[==== ]", "[===== ]",
        // "[====== ]", "[======= ]", "[======== ]", "[========= ]", "[==========]" };

        // System.out.print("\033[H\033[2J");
        // System.out.flush();
        // Thread.sleep(500);
        // for (int i = 0; i < importantInfo.length; i++) {
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();

        // // Pause for 4 seconds
        // // Print a message
        // System.out.println(importantInfo[i]);
        // Thread.sleep(200);
        // System.out.print("\033[H\033[2J");
        // System.out.flush();
    }
}