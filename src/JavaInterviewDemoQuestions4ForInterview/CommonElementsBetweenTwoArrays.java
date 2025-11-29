package JavaInterviewDemoQuestions4ForInterview;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {4,5,6,7,8};
        Set<Integer> commonElements = findCommonElements(array1,array2);
        System.out.println("Common Elements: " +commonElements);
    }

    private static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commnSet = new HashSet<>();

        for ( int num:array1) {
            set1.add(num);
        }
        for (int num:array2) {
            if (set1.contains(num)) {
                commnSet.add(num);
            }
        }
        return commnSet;
    }
}
