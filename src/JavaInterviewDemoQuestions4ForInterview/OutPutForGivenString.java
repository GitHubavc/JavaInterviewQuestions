package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class OutPutForGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for count : ");
        String str = sc.nextLine();
        String result = outputCountForString(str);
        System.out.println("The char and its count is : " +result);
        sc.close();
    }

    private static String outputCountForString(String str) {
        StringBuilder sb = new StringBuilder();
        int count =1;
        for (int i = 0; i<str.length(); i++) {
            if(i+1 <str.length() && str.charAt(i)==str.charAt(i+1)){
                count++;
            } else {
                sb.append(str.charAt(i)).append(" = ").append(count).append(" ");
                count =1;
            }
        }
        return sb.toString();
    }

}
