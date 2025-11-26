package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here : ");
        String str = sc.nextLine();
        boolean result = isPalindrome(str);
        System.out.println("Is "+str+" a Palindrome : " +result );
        sc.close();
    }

    private static boolean isPalindrome(String strVal) {
        String str = strVal.toLowerCase().trim();
        int start = 0;
        int end = str.length()-1;
        for (int i = 0 ; i<end ; i++) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
