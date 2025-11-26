package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class CountNoOfWordsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string here : ");
        String words = sc.nextLine();
        int noOfWords = countNoOfWordsInString(words);
        System.out.print("The No Of Words are = " +noOfWords);
        sc.close();
    }

    private static int countNoOfWordsInString(String words) {
        int count = 1;
        for (int i = 0; i< words.length(); i++) {
            if (words.charAt(i)==' ' && words.charAt(i+1)!=' ') {
                count ++;
            }
        }
        return count;
    }
}
