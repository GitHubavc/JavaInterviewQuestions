package JavaInterviewDemoQuestions4ForInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysWithNoDuplicates {
    public static void main(String[] args) {
        int[] array = {5,2,9,1,6,2,5};
        System.out.println("Using Java Streams : ");
        Arrays.stream(array).distinct().sorted().forEach(e-> System.out.print(e+ " "));
        System.out.println("\n Using old school method :  ");
        int[] uniqueArray = removeDuplicates(array);
        for (int num :uniqueArray) {
            System.out.print( num+ " ");
        }
    }
    public  static int[] removeDuplicates(int[] array ) {
        Set<Integer> set = new HashSet<>();
        for(int num : array) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i=0;
        for(int num :set) {
            result[i++] = num;
        }
       return result;
    }
}
