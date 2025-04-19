package JavaInterviewProgrammes;

import java.util.Scanner;

//How are you now
//now you are how
public class ReverseWordsDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in );
        System.out.println("Enter the String of words to reverse: ");
        String str=sc.nextLine();

        String[] arr=str.split(" ");
        String reversedWords= "";
        for (int i=arr.length-1; i>=0;i--){
            reversedWords=reversedWords+" "+arr[i];

        }
        System.out.println("The reversed words are: "+reversedWords);

    }
}
