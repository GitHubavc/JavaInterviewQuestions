package JavaInterviewProgrammes;

import java.util.Arrays;

public class LargestSmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7,-45,-3,0, 9, 23, 345, 1, 2};
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The largest element is : " +largest);
        System.out.println("The smallest element is : " +smallest);

    }
}
