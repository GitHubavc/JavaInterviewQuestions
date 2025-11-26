package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class FindTwoStringsAreAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second String : ");
        String str2 = sc.nextLine();
        boolean result = isAnagram(str1,str2);
        System.out.println("Are the given strings " +str1+ " and  " +str2+ " Anagrams --> " +result);
        sc.close();

    }

    private static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCount = new int[256];
        for (int i = 0;i<str1.length();i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }
        for ( int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
