package JavaInterviewDemoQuestions4ForInterview;

import java.util.Scanner;

public class VowelsAndConsinents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here : ");
        String str = sc.nextLine();
        vowelAndConsinents(str);
        sc.close();
    }

    private static void vowelAndConsinents(String str) {
        int vowels = 0,consinents = 0;
        str= str.toLowerCase();
        for (char c :str.toCharArray()) {
            if (c>='a' && c<='z') {
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                    vowels++;
                } else {
                    consinents++;
                }
            }
        }
        System.out.println("Vowels : " +vowels);
        System.out.println("Consinents : " +consinents);
    }
}
