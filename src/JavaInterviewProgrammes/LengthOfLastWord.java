package JavaInterviewProgrammes;

import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String here : ");
        String str = sc.nextLine();
        System.out.println(lengthOfLastWord(str));
    }

    private static int lengthOfLastWord(String str) {

        String words = str.trim();
        int count = 0;

        for (int i= words.length()-1; i >= 0; i--) {
            if (!(words.charAt(i) == ' ')) {
                count++;
            } else {
                break;
            }
        }
        return count;

    }
}
