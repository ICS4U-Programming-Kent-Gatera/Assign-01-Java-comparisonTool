import java.util.Scanner;

/**
 * My program compares and picks the largest number/letter.
 *
 * @author  Kent Gatera
 * @version 1.0
 * @since   2024-Mar-18
 */

class comparisonTool {

    /** Pleases the style checker.
    *
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */

    private comparisonTool() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is where the main code will be.
     *
     * @param args
     *
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userChoice;
        do {
            System.out.println("Would you like to compare sentences (Press 1) or numbers? (Press 2). ");
            System.out.print("Enter 'q' to quit : ");
            userChoice = in.nextLine();

            switch (userChoice) {
                case "q":
                    System.out.println("Thank you for playing.");
                    break;
                case "1":
                    System.out.println(sentenceSizeComp() + " characters long. ");
                    break;
                case "2":
                    System.out.println(numSizeComp() + " is the biggest number. ");
                    break;
                default:
                    System.out.println(userChoice + " is not a valid/displayed choice.");
            }
        } while (!userChoice.equals("q"));
        in.close();
    }

    /**
     * This is where sentence sizes will be compared.
     *
     * @param args
     *
     */
    public static int sentenceSizeComp() {
        int sentLength = 0;
        String biggestWord = "";
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("How many sentences/words do you want to compare?: ");
            int totalNum = in.nextInt();
            in.nextLine();
            // looping until we get to the amount specified.
            for (int counter = 1; counter <= totalNum; counter++) {
                System.out.print("What will be your (" + counter + ") sentence/word?: ");
                String userSentence = in.nextLine();
                // Checking which is the biggest sentence and recording it.
                if (userSentence.length() > sentLength) {
                    sentLength = userSentence.length();
                    biggestWord = userSentence;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.print("Enter a valid numeral input.");
        }
        System.out.println(biggestWord + " is the biggest sentence/word");
        return sentLength;
    }

    /**
     * This is where numbers will be compared.
     *
     * @param args
     *
     */
    public static float numSizeComp() {
        float biggestNum = 0;
        Scanner in = new Scanner(System.in);
        try {
            // Init how many numbers to compare (EF).
            System.out.print("How many numbers to compare: ");
            int totalNum = in.nextInt();
            // looping until we get to the amount specified.
            for (int counter = 1; counter <= totalNum; counter++ ) {
            System.out.print("What will be your (" + counter + ") number: ");
            float userNumInput = in.nextFloat();
                // Checking which is the biggest number and recording it.
                if (userNumInput > biggestNum) {
                    biggestNum = userNumInput;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.print("Enter a valid numeral input.");
        }
        return biggestNum;
    }
}