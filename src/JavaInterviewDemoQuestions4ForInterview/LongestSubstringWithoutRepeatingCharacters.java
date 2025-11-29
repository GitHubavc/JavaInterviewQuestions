package JavaInterviewDemoQuestions4ForInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here : ");
        String str =sc.nextLine();
        int maxLength =  lengthOfLongString(str);
        System.out.println("Max length of substring without repeat chars : " +maxLength);

    }
    public static int lengthOfLongString(String s){
        int start=0;
        int end=0;
        int max_length=0;
        List<Character> list= new ArrayList<Character>();

        while(end< s.length())
        {
            if (!list.contains(s.charAt(end)))
            {
                list.add((s.charAt(end)));
                end++;
                max_length = Math.max(max_length, list.size());
            } else {

                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }

        }
        return max_length;

    }

}

