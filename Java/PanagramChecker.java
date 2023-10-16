// import java.util.HashSet;
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
        boolean[] alphabet = new boolean[26];
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                int index = ch - 'a';
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    count++;
                }
            } else if ('A' <= ch && ch <= 'Z') {
                int index = ch - 'A';
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    count++;
                }
            }
            if (count == 26) {
                return true;
            }
        }
        return false;
    }
}
