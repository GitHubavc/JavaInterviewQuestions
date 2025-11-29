package JavaInterviewDemoQuestions4ForInterview;

import java.util.Arrays;
import java.util.OptionalInt;

public class LargestAndSmallestInArray {
    public static void main(String[] args) {
        int[] array = {5,2,9,1,6,3,11,14,3,9};
        System.out.println("#########################");
        System.out.println("Using Java Streams : ");
        OptionalInt max = Arrays.stream(array).max();
        System.out.println("Max using Streams is : "+max.getAsInt());
        OptionalInt min = Arrays.stream(array).min();
        System.out.println("Min using Streams is : "+min.getAsInt());
        System.out.println("#########################");

        System.out.println("Using Normal Method driven : ");
        int[] result = findLargestAndSmallest(array);
        System.out.println("Smallest : "+result[0]);
        System.out.println("Largest : "+result[1]);

    }

    private static int[] findLargestAndSmallest(int[] array) {
        if(array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or Empty");
        }
        int smallest = array[0];
        int largest = array[0];
        for (int num:array) {
            if (num <smallest) {
                smallest = num;
            }
            if (num>largest) {
                largest = num;
            }
        }
        return new int[]{smallest,largest};
    }
}
