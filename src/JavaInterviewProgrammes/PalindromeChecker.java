package JavaInterviewProgrammes;

import java.util.Scanner;
//using recursion
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String here: ");
        String str=sc.nextLine();
        boolean result=isPalindome(str);
        System.out.println(str+ " Is Palindrome = "+result);

    }

    private static boolean isPalindome(String str) {

        if(str==null){
            return false;
        }
        if(str.length()<=1){
            return true;
        }
        String first= str.substring(0,1);
        String last=str.substring(str.length()-1,str.length());
        if(!first.equals(last)){
            return false;
        }else{
            return isPalindome(str.substring(1,str.length()-1));
        }


    }
}
