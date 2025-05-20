package JavaInterviewProgrammes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfWordsInAString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the words here: ");
        String words=sc.nextLine();

        Map<String,Integer> map= new HashMap<String,Integer>();
        Integer count= 1;
        String[] arr = words.split(" ");
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], count);
            }else{
                map.put(arr[i],map.get(arr[i])+1);

            }
        }
        for(String x:map.keySet()){
            System.out.println("The count of word: "+x+" = "+map.get(x));
        }

    }
}
