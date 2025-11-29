package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class SegregateAllChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        segregateAllChars(str);
        sc.close();
    }

    private static void segregateAllChars(String str) {
        StringBuilder upper = new StringBuilder();
        StringBuilder lower = new StringBuilder();
        StringBuilder numericPart = new StringBuilder();
        StringBuilder specialChar = new StringBuilder();

        for ( char ch:str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper.append(ch);
            } else if(Character.isDigit(ch)) {
                numericPart.append(ch);
            } else if (!Character.isLetterOrDigit(ch)) {
                specialChar.append(ch);
            } else if (Character.isLowerCase(ch)) {
                lower.append(ch);
            }
        }
        System.out.println("UpperCase : " +upper);
        System.out.println("LowerCase : " +lower);
        System.out.println("Numeric : " +numericPart);
        System.out.println("Special : " +specialChar);
    }
}

