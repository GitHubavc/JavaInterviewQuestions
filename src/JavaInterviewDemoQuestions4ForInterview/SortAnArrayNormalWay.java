package JavaInterviewDemoQuestions4ForInterview;

import java.util.Arrays;
import java.util.Collections;

public class SortAnArrayNormalWay {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6};
        selectionSort(array);

        System.out.print("\nSorted array normally :");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.print("\nSorted using in build method : ");
        Arrays.stream(array).sorted().forEach(e-> System.out.print(e+" "));
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            } // Swap array[i] and array[minIndex]
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}


