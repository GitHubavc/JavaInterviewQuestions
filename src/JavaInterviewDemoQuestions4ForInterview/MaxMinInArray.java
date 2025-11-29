package JavaInterviewDemoQuestions4ForInterview;

public class MaxMinInArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 3};
         int max = findMaximum(array);
        int min = findMinimum(array);
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);
    }

    public static int findMaximum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        } return max;
    }
    public static int findMinimum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        } return min;
    }
}

