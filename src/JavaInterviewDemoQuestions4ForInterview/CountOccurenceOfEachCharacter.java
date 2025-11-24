package JavaInterviewDemoQuestions4ForInterview;

import java.util.HashMap;
import java.util.Scanner;

public class CountOccurenceOfEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here : ");
        String str = sc.nextLine();
        countOccurOfEachChar(str);
        sc.close();
    }

    private static void countOccurOfEachChar(String str) {
        HashMap<String,Integer> hm = new HashMap<>();
        String[] words = str.split(" ");

        for(String word : words) {
            if(hm.containsKey(word)){
                hm.put(word,hm.get(word)+1);
            } else {
                hm.put(word,1);
            }
        }

        System.out.println("Character count is : "+hm);
    }
}
