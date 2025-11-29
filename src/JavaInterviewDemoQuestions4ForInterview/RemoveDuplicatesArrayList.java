package JavaInterviewDemoQuestions4ForInterview;

import java.util.*;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        List<Integer> newList = Arrays.asList(23,55,33,12,11,23,55,10,3,5,6,3,1,44,11);
        System.out.println("Using Java Streams  newList : ");
        newList.stream().sorted().distinct().forEach(e-> System.out.print(e+ " "));

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5); arrayList.add(2); arrayList.add(9); arrayList.add(1); arrayList.add(6); arrayList.add(2); arrayList.add(5);
        List<Integer> uniqList = removeDupicates(arrayList);
        System.out.println("\nArrayList with no duplicates using hashset: ");
        for (int num: uniqList) {
            System.out.print(num + " ");
        }
    }
    public static List<Integer> removeDupicates(ArrayList<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}
