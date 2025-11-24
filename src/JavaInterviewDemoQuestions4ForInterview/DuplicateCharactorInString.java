package JavaInterviewDemoQuestions4ForInterview;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharactorInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string : ");
        String  str = sc.nextLine();
        duplicateCharInString(str);
        sc.close();

    }

    private static void duplicateCharInString(String str) {
        HashMap<Character,Integer> charCountMap = new HashMap<>();
        char[] strArray = str.toCharArray();
        for( char c : strArray) {
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }
        Set<Character> charInString = charCountMap.keySet();
        System.out.println("Duplicates in the string is " + str);
        for(char ch :charInString) {
            if(charCountMap.get(ch) > 1){
                System.out.println(ch + " : " + charCountMap.get(ch));
            }
        }
    }
}
