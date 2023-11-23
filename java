import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        System.out.println("Shuffled Array: " + Arrays.toString(list.toArray()));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number: ");
        String romanNumber = scanner.nextLine().toUpperCase();
        int integerValue = romanToInteger(romanNumber);
        System.out.println("Integer Value: " + integerValue);

        System.out.print("Enter a sentence to check for Pangram: ");
        String sentence = scanner.nextLine().toLowerCase();
        boolean isPangram = checkPangram(sentence);
        if (isPangram) {
            System.out.println("The input is a Pangram.");
        } else {
            System.out.println("The input is not a Pangram.");
        }
    }

    private static int romanToInteger(String s) {
        return 0;
    }

    private static boolean checkPangram(String sentence) {
        return false;
    }
}
