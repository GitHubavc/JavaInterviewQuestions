package JavaInterviewProgrammes;

import java.util.Scanner;

public class PrimeNumberTrueOrFalse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer to check if its Prime : ");
        int num=sc.nextInt();
        System.out.println(isPrime(num));
        sc.close();
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        int count = 0;

        for (int i= 1; i<=num ; i++) {
            if (num%i == 0) {
                count++;
            }
        }
        return count==2;
    }
}
