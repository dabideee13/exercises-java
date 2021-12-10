import java.util.*;

public class CharacterCounter {

    public static void main(String[] args) throws Exception {
        String choice = "Y";
        Scanner userInput = new Scanner(System.in);
    
        while (true) {
            if (choice.equals("Y")) {
                getInputs();

                System.out.print("Do you want to do it again? Y/N?");
                choice = userInput.next().toUpperCase().strip();

            } else if (choice.equals("N")) {
                break;

            } else {
                System.out.print("Invalid choice.");
                break;

            }
        }
    }

    public static int countOccurence(String inputString, char inputChar) {
        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputChar) {
                count++;
            }
        }
        
        return count;
    }

    public static void getInputs() {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Input string: ");
        String inputString = userInput.nextLine();

        System.out.print("Input character: ");
        char inputChar = userInput.next().charAt(0);

        int count = countOccurence(inputString, inputChar);
        System.out.print("The number of " + inputChar + "in the string is: " + count + "\n");

    }
}
