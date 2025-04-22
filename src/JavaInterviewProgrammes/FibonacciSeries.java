package JavaInterviewProgrammes;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Provide the no.of values to be displayed for fibonacci : ");
        Long n=sc.nextLong();
        fibonacciSeriesCreation(n);
        sc.close();

    }
    private static void fibonacciSeriesCreation(Long num){
        Long first = 0L;
        Long second= 1L;
        for(Long i = 1L; i<=num; i++){
            System.out.print(first+" ");
            Long third=first+second;
            first=second;
            second=third;
        }
    }
}
