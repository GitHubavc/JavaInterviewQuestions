package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here : ");
        int num = sc.nextInt();
        System.out.println("The given number is : " +oddEvenNumber(num));
        sc.close();

    }

    private static String oddEvenNumber(int num) {

        if (num <=0) {
            return "INVALID";
        }

        if(num%2==0) {
            return "EVEN";
        }
        return "ODD";
    }
}
