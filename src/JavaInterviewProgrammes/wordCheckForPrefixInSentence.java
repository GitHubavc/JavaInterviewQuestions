package JavaInterviewProgrammes;

import java.util.Scanner;

public class wordCheckForPrefixInSentence {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String sentence = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the search word : ");
        String searchWord = sc2.nextLine();
        System.out.println(checkPrefix(sentence,searchWord));
        sc1.close();
        sc2.close();
    }

    private static int checkPrefix(String sentence, String searchWord) {
        String[] sentences = sentence.split(" ");

        for (int i=0; i<sentences.length;i++) {
            if (sentences[i].startsWith(searchWord)) {
                return i+1;
            }
        }
        return -1;
    }
}
