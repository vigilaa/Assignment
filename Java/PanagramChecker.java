import java.util.HashSet;
import java.util.Scanner;

public class PanagramChecker {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine(); 
        scanner.close();
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
                String lowercaseInput = input.toLowerCase();
        HashSet<Character> alphabetSet = new HashSet<>();
        for (char ch : lowercaseInput.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabetSet.add(ch);
            }
        }
        return alphabetSet.size() == 26;
    }
}
