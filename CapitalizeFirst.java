import java.util.*;

public class Main {

    // public static String SAMPLE = "hello world";

    public static void main(String[] args) {
        String choice = "Y";
        Scanner userInput = new Scanner(System.in);

        while (true) {
            if (choice.equals("Y")) {

                System.out.println("Input: ");
                String inputString = userInput.nextLine();

                List<String> inputText = Arrays.asList(inputString.split(" "));
                List<String> arr = new ArrayList<>();

                for (int i = 0; i < inputText.size(); i++) {
                    arr.add(capitalize(inputText.get(i)));
                }
                System.out.println(join(arr));

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

    public static String capitalize(String str) {

        if (str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);

    }

    public static String join(Collection<String> words) {
        StringBuilder wordList = new StringBuilder();
        for (String word : words) {
            wordList.append(word + " ");
        }
        return new String(wordList.deleteCharAt(wordList.length() - 1));
    }

}
