package JavaInterviewDemoQuestions4ForInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindNonRepeatedElementInArray {
    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,4,5,5};
        List<Integer> result = findNonRepeatedElements(array);
        System.out.println("Non-Repeated Elements : "+result);
    }

    private static List<Integer> findNonRepeatedElements(int[] array) {
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int num:array) {
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        }
        List<Integer> nonRepeatedElements = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:countMap.entrySet()) {
            if(entry.getValue()==1) {
                nonRepeatedElements.add(entry.getKey());
            }
        }
        return nonRepeatedElements;
    }
}
