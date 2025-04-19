package JavaInterviewProgrammes;

import java.util.Scanner;
//how are you
//woh era uoy
public class ReverseEveryWordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();

        String[] arr= str.split(" ");
        String result="";

        for(String word:arr){
            String reverseWord = "";
            int j=word.length()-1;
            while(j>=0){
                char ch= word.charAt(j);
                reverseWord=reverseWord+ch;
                j--;
            }
            result=result+reverseWord+ " ";
        }
        System.out.println("The reverse word is : "+result);
    }
}
