package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class ReverseAnyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Number Before Reversal  : ");
        int num =sc.nextInt();
        int reversed = reverseNumber(num);
        System.out.println("Number After Reversal  : "+reversed);
    }

    private static int reverseNumber(int num) {
        int revNum = 0;
        if(num<=0) {
            return -1;
        }
        while (num>0) {
            int digit = num%10;
            revNum= revNum * 10 + digit;
            num = num/10;
        }
        return revNum;
    }
}
