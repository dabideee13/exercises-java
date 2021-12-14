import java.util.*;

public class Main {

    // public static String sample = "the cow jumped over the moon";
    public static String SAMPLE = "THE COW JUMPED OVER THE MOON";

    public static void main(String[] args) {
        String choice = "Y";
        Scanner userInput = new Scanner(System.in);

        while (true) {
            if (choice.equals("Y")) {

                System.out.println("Input: ");
                String inputString = userInput.next();

                List<String> input = toLista(inputString);
                ArrayList<String> input2 = toArrayList(input);
                countVowels(input2);

                System.out.print("Do you want to do it again? Y/N\n");
                choice = userInput.next().toUpperCase().strip();

            } else if (choice.equals("N")) {
                break;

            } else {
                System.out.print("Invalid choice.");
                break;

            }

        }

    }

    public static List<String> toLista(String str) {
        return Arrays.asList(str.toLowerCase().split(" "));
    }

    public static ArrayList<String> toArrayList(List<String> myList) {
        ArrayList<String> arl = new ArrayList<String>();
        for (Object object : myList) {
            arl.add((String) object);
        }
        return arl;

    }

    public static void countVowels(ArrayList<String> vowels) {
        String arrayToString = vowels.toString();
        int length = arrayToString.length();
        System.out.println("A: " + (length - arrayToString.replace("a", "").length()));
        System.out.println("E: " + (length - arrayToString.replace("e", "").length()));
        System.out.println("I: " + (length - arrayToString.replace("i", "").length()));
        System.out.println("O: " + (length - arrayToString.replace("o", "").length()));
        System.out.println("U: " + (length - arrayToString.replace("u", "").length()));
    }

}
