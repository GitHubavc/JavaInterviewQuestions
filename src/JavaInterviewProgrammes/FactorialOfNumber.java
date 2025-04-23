package JavaInterviewProgrammes;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to get its Factorial: ");
        int num=sc.nextInt();
        findFactorial(num);
        sc.close();
    }
    private static void findFactorial(int number){
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of "+number+" is: " +fact);
    }

}
