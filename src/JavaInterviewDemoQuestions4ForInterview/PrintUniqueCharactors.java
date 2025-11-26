package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class PrintUniqueCharactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Unique characters in \"" + input + "\":");
        printUniqueCharacters(input);
    }

    private static void printUniqueCharacters(String str) {
        boolean[] unique = new boolean[128];
        for (int i = 0 ; i< str.length(); i++) {
            char ch = str.charAt(i);
            if (!unique[ch]) {
                unique[ch] = true;
                System.out.print(ch + " ");
            }
        }
    }
}
