package LeetCodeQuestions;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abc";
        String s = "dog cat dog";

        System.out.println(wordPatternLogic(pattern,s));

    }
    public static boolean wordPatternLogic(String pattern,String s) {

        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        HashMap<Character,String> hm = new HashMap<Character,String>();
         for (int i= 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            boolean containsKey= hm.containsKey(ch);

            if(hm.containsValue(arr[i]) && !containsKey) {
                return false;
            }
            if(containsKey && !hm.get(ch).equals(arr[i])){
                return false;
            }
            else {
                hm.put(ch,arr[i]);
            }
        }
        return true;
    }
}
