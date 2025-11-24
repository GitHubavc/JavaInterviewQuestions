package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class ArmstrongNumber {

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length(); // Count number of digits

        while (number != 0) {
            int digit = number % 10; // Extract each digit
            sum += (int) Math.pow(digit, digits); // Add each digit raised to 'digits'
            number /= 10; // Remove the last digit
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
}

