package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class SwapTwoStringWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string : ");
        String str2 = sc.nextLine();
        System.out.println("Before Swapping : " +str1+ " " +str2);
        String result = swapTwoStringsWithoutThirdVariable(str1,str2);
        System.out.println("After Swapping : " +result);
        sc.close();
    }

    private static String swapTwoStringsWithoutThirdVariable(String str1, String str2) {
        str1 = str1+str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());
        return str1+ " " +str2;
    }
}
