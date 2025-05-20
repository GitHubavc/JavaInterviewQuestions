package LeetCodeQuestions;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer to add : ");
        int number = sc.nextInt();
        System.out.println(addDigitsToReturnOneDigit(number));
        sc.close();

    }

    private static int addDigitsToReturnOneDigit(int num) {

        if (num == 0) { return 0; }
        else if (num % 9 ==0) { return 9; }
        else return num%9;
    }
}

