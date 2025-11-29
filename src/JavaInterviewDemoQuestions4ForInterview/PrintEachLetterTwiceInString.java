package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class PrintEachLetterTwiceInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to double : ");
        String str = sc.nextLine();
        String result = printEachLetter(str);
        System.out.println("Doubled String is : " +result);
    }

    private static String printEachLetter(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< str.length();i++) {
            char ch = str.charAt(i);
            sb.append(ch).append(ch);
        }
        return sb.toString();
    }
}
