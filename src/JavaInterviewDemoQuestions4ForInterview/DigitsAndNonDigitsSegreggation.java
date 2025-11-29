package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class DigitsAndNonDigitsSegreggation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings with zeros : ");
        String str = sc.nextLine();
        String result = segregateDigitsWithNonDigits(str);
        System.out.println("Result is : " + result);
    }

    private static String segregateDigitsWithNonDigits(String str) {
        StringBuilder digits = new StringBuilder();
        StringBuilder nonDigits = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                nonDigits.append(ch);
            }
        }
        return digits+nonDigits.toString();
    }
}
