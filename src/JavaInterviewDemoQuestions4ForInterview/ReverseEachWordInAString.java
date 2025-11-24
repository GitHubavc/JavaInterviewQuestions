package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class ReverseEachWordInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        String reversal = revesalOfWordsInString(str);
        System.out.println(reversal);
        sc.close();
    }

    private static String revesalOfWordsInString(String str) {
        String revString = "";
        String[] words = str.split(" ");

        for(int i = 0; i<words.length; i++) {
            String revWord ="";
            String word = words[i];
            for(int j = word.length()-1; j>=0;j--) {
                revWord = revWord + word.charAt(j);
            }
            revString = revString + revWord;

            if (i < words.length - 1) {
                revString = revString + " ";
            }
        }
        return revString;
    }

}
