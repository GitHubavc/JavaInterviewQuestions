package JavaInterviewProgrammes;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Provide the no.of values to be displayed for fibonacci : ");
        int n=sc.nextInt();
        fibonacciSeriesCreation(n);
        sc.close();

    }
    private static void fibonacciSeriesCreation(int num){
        int first = 0;
        int second= 1;
        for(int i = 1; i<=num; i++){
            System.out.print(first+" ");
            int third=first+second;
            first=second;
            second=third;
        }
    }
}
