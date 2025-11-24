package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class GivenNumberIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number here : ");
        int num = sc.nextInt();
        if(isPalindromeNumber(num)) {
            System.out.println("the given number " +num+ " is Palindrome");
        }else {
            System.out.println("the given number " +num+ " is NOT Palindrome");
        }
        sc.close();
    }

    private static boolean isPalindromeNumber(int num) {
        int revNumber = 0;
        int digits;
        int original = num;

        if (num < 0) {return false;}

        while(num > 0) {

            digits = num% 10;
            revNumber = revNumber*10 + digits;
            num = num/10;

        }
        return revNumber == original;
    }
}
