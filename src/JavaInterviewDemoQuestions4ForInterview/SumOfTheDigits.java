package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class SumOfTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number to find its sum : ");
        int num = sc.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("The sum of the digits are : "+sum);
        sc.close();
    }

    private static int sumOfDigits(int num) {
        int digit;
        int sum = 0;

        while (num != 0) {

            digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        return sum;
    }

}
