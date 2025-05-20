package LeetCodeQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5};
//        System.out.println(containsDuplicateUsingHashSet(numbers));
        System.out.println(containsDuplicateUsingSort(numbers));

    }

    public static boolean containsDuplicateUsingHashSet(int[] num) {
        Set<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < num.length; i++) {
            if (hs.contains(num[i])) return true;
            hs.add(num[i]);
        }
        return false;
    }

    public static boolean containsDuplicateUsingSort(int[] num) {
        Arrays.sort(num);
        for (int i = 0; i < num.length-1; i++) {
            if (num[i] == num[i + 1]) return true;
        }
        return false;
    }
}
