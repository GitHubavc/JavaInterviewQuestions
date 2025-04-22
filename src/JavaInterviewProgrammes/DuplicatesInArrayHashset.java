package JavaInterviewProgrammes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArrayHashset {
    public static void main(String[] args) {
        int[] inputArr={2,4,6,11,3,1,11,66,78,99};
        findDuplicateUsingSet(inputArr);
        findDuplicateUsingHashMap(inputArr);

    }

    //usingHashset
    private static void findDuplicateUsingSet(int[] arr){
        Set<Integer> hs= new HashSet<Integer>();
        for(int x:arr){
            if(!hs.add(x)){
                System.out.println("The duplicate element via hashset : "+x);
            }
        }
    }

    //using Hashmap
    private static void findDuplicateUsingHashMap(int[] arr){
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for(int num:arr){
            if(!hm.containsKey(num)){
                hm.put(num,1);
            }else{
                hm.put(num,hm.get(num)+1);
            }
        }
        for(Integer num:hm.keySet()){
            if(hm.get(num)>1){
                System.out.println("Duplicate element via hashset is : "+num);
            }
        }
    }
}
