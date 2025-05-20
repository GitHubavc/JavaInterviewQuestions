package JavaInterviewProgrammes;

import java.util.Scanner;

public class ReverseOnlyEngAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to reverse : ");
        String str = sc.nextLine();
        System.out.println("The reversed string is : " +reverseOnlyEnglishAlphabets(str));
        sc.close();
    }

    private static String reverseOnlyEnglishAlphabets(String str) {

        int start = 0;
        int end = str.length()-1;
        char[] ch = str.toCharArray();

        while (start < end) {
            if (!Character.isLetter(ch[start])) {
                start ++;
            } else if (!Character.isLetter(ch[end])) {
                end--;
            }
            else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end]= temp;
                start ++;
                end --;

            }
        }
        return new String(ch);
    }
}
