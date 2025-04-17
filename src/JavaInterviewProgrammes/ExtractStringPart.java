package JavaInterviewProgrammes;

import java.util.Scanner;

public class ExtractStringPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to Extract: ");
        String str=sc.nextLine();

        System.out.println(str.substring(0,4));
        System.out.println(str.substring(str.length()-4,str.length()));
    }
}
