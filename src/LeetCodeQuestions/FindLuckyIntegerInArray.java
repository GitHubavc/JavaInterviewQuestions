package LeetCodeQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        System.out.println(luckyInteger(arr));

    }
    public static int luckyInteger(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i])+1);
            } else {
                hm.put(arr[i],1);
            }
        }
        int x= 0;
        int max = -1;
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            if(entry.getKey() == entry.getValue()) {
                x= entry.getValue();
                max = Math.max(x,max);
            }
        }
        return max;

    }
}
