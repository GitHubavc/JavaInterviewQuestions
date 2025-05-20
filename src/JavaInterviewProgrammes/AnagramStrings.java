package JavaInterviewProgrammes;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the Second string: ");
        String str2 = sc.nextLine();
        sc.close();

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Given Strings are ANAGRAM !!!");
        } else {
            System.out.println("Given Strings are NOT ANAGRAM !!! ");
        }

    }
}
