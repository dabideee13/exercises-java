import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;
        String choice = "Y";

        while (true) {
            if (choice.equals("Y")) {

                System.out.print("Input: \n");
                // userInput = scan.nextLine();
                userInput = scan.nextLine();
                userInput = userInput.toLowerCase();
                countVowels(userInput);

                System.out.print("Do you want to do it again? Y/N\n");
                choice = scan.nextLine().toUpperCase().strip();

            } else if (choice.equals("N")) {
                break;

            } else {
                System.out.println("Invalid choice.");
                break;
            }

        }
    }

    public static void countVowels(String userInput) {
        int vowelA = 0, vowelE = 0, vowelI = 0, vowelO = 0, vowelU = 0;

        for(int x = 0; x <= userInput.length() - 1; x++) {
            if(userInput.charAt(x) == 97)
            vowelA++;
            else if(userInput.charAt(x) == 101)
            vowelE++;
            else if(userInput.charAt(x) == 105)
            vowelI++;
            else if(userInput.charAt(x) == 111)
            vowelO++;
            else if(userInput.charAt(x) == 117)
            vowelU++;
        }

        System.out.println("A: " + vowelA);
        System.out.println("E: " + vowelE);
        System.out.println("I: " + vowelI);
        System.out.println("O: " + vowelO);
        System.out.println("U: " + vowelU);

    }
}
