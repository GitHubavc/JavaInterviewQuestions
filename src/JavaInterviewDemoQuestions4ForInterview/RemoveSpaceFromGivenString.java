package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class RemoveSpaceFromGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to remove space : ");
        String  str = sc.nextLine();
        String result = removeSpaceFromString(str);
        System.out.println("The String after removal of space is : "+result);
        sc.close();
    }

    private static String removeSpaceFromString(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<str.length(); i++) {
            if(str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
