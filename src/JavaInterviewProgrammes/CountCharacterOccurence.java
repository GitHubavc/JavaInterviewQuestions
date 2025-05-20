package JavaInterviewProgrammes;

import java.util.Scanner;

public class CountCharacterOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        sc.close();

        int result=str.length()-str.replaceAll("a","").length();
        System.out.println("No of characters : " +result);
    }
}
