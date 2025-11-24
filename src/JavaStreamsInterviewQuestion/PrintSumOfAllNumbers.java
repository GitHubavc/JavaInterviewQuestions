package JavaStreamsInterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PrintSumOfAllNumbers {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,4,5,33,4,56,22,4,87,55,77,23,44,11,2,54,88);

        Optional<Integer> sum = list.stream().reduce((a, b)->a+b);
        System.out.println("Sum of numbers =  " +sum.get());

    }
}
