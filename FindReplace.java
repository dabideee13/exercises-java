import java.util.*;

public class Main {


    public static void main(String[] args) {
        String choice = "Y";
        Scanner userInput = new Scanner(System.in);

        while (true) {
            if (choice.equals("Y")) {

                System.out.println("Input: ");
                String inputString = userInput.nextLine();

                System.out.println("Which string will you replace: ");
                String toReplace = userInput.nextLine();

                System.out.println("What will you replace with: ");
                String replaceWith = userInput.nextLine();

                System.out.println(replace(inputString, toReplace, replaceWith));

                System.out.print("Do you want to do it again? Y/N\n");
                choice = userInput.nextLine().toUpperCase().strip();

            } else if (choice.equals("N")) {
                break;

            } else {
                System.out.print("Invalid choice.");
                break;

            }

        }

    }

    public static String replace(String str, String toReplace, String replaceWith) {
        return str.replaceAll(toReplace, replaceWith);
    }
}
