package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class FibinocciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of terms : ");
        int num= sc.nextInt();
        int first = 0, second = 1, next;
        System.out.println("Fibonacci series is --->>>> ");
        for (int i = 0; i <= num; i++) {
            System.out.print(first + " ");
            next = second + first;
            first = second;
            second = next;
        }
    }
}

