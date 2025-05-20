package JavaInterviewProgrammes;

import java.util.HashMap;
import java.util.Map;

public class FreqOfEleInArray {
    public static void main(String[] args) {
        int[] arr = {1,4,5,9,7,7,1,4,5};
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for (int i=0;i<arr.length;i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i],hm.get(arr[i])+1);
            } else {
                hm.put(arr[i],1);
            }
        }

        for ( Map.Entry entry:hm.entrySet()) {
            System.out.println("Element : "+entry.getKey()+" | Frequency "+entry.getValue());
        }


    }
}
