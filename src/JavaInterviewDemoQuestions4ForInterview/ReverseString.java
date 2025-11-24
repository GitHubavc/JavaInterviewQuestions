package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to reverse : ");
        String str = sc.nextLine();
        String rev = reversedString(str);
        System.out.println(rev);
        sc.close();
    }

    private static String reversedString(String str) {
        String reverse = "";

        for (int i = str.length()-1; i>=0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse.trim();
    }

}
