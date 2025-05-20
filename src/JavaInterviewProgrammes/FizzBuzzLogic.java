package JavaInterviewProgrammes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzzLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here : ");
        int number = sc.nextInt();
        List<String> list = fizzBuzzLogic(number);
        System.out.println(list);

    }

    private static List<String> fizzBuzzLogic(int num) {
        List<String> arr = new ArrayList<>();
        for (int i = 1; i<= num; i++) {
            if (i%3==0 && i%5==0) {
                arr.add("FizzBuzz");
            } else if (i%3==0) {
                arr.add("Fizz");
            } else if (i%5==0) {
                arr.add("Buzz");
            } else {
                arr.add(String.valueOf(i));
            }
        }
        return arr;
    }
}
