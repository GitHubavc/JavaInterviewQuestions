package JavaInterviewDemoQuestions4ForInterview;

import java.util.*;

public class SortHashMapByKeyUsingStreams {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Banana", 3);
        hashMap.put("Apple", 5);
        hashMap.put("Orange", 2);
        hashMap.put("Mango", 4);

        System.out.println(hashMap);

        // LinkedHashMap to store in sorted order
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Convert with sorted order (by key)
        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())   // sort keys alphabetically
                .forEach(e -> linkedHashMap.put(e.getKey(), e.getValue()));

        System.out.println("LinkedHashMap (sorted by keys):");
        System.out.println(linkedHashMap);
    }
}