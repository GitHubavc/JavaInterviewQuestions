package JavaInterviewProgrammes;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int num=sc.nextInt();
        System.out.println(reverseAnyNumber(num));
    }
    //eg number= 1234 ; 4
    private static int reverseAnyNumber(int number){
        int result=0;
        while (number>0){
            result=result*10+number%10;
            number=number/10;
        }
        return result;
    }
}
