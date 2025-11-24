package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial: ");
        int fact = sc.nextInt();
        int factorial = factNumber(fact);
        System.out.println("factorial is : " +factorial);
        sc.close();

    }

    private static int factNumber(int fact) {
        int result = 1;
        for (int i=1; i<=fact; i++) {
            result =result * i;
        }
        return result;
    }
}
