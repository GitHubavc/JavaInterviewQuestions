package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class DigitCounter {

    // Method to count number of digits
    public static int countDigits(int number) {
        if (number == 0) {
            return 1; // Special case: 0 has 1 digit
        }

        number = Math.abs(number); // Handle negative numbers
        int count = 0;

        while (number > 0) {
            number /= 10; // Remove last digit
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int digits = countDigits(num);
        System.out.println(num + " contains " + digits + " digit(s)");

        scanner.close();
    }
}
