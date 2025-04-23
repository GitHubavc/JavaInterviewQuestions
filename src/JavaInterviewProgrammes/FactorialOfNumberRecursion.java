package JavaInterviewProgrammes;

import java.util.Scanner;

public class FactorialOfNumberRecursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to get its Factorial: ");
        int num=sc.nextInt();
        System.out.println("The factorial of "+num+" is = "+findFactorial(num));
        sc.close();
    }
    public static int findFactorial(int n){
        if(n<=1){
            return 1;
        }else{
            return n * findFactorial(n-1);
        }
    }
}
