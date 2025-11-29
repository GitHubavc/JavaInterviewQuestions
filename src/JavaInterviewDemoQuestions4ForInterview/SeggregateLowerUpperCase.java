package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class SeggregateLowerUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        lowerUpperCaseChars(str);
        sc.close();
    }

    private static void lowerUpperCaseChars(String str) {
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();
        for ( char ch:str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowerCase.append(ch);
            } else {
                upperCase.append(ch);
            }
        }
        System.out.println("Lowercase : " +lowerCase);
        System.out.println("UpperCase : " +upperCase);
    }
}
