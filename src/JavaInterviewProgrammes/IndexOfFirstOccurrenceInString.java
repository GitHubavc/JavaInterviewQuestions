package JavaInterviewProgrammes;

import java.util.Scanner;

public class IndexOfFirstOccurrenceInString {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the haystack string here : ");
        String StHaystack = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the needle string here : ");
        String StNeedle = sc2.nextLine();
        sc1.close();
        sc2.close();
        System.out.println("The index of the Needle in the Haystack is : " + needleIndex(StHaystack, StNeedle));

    }

    public static int needleIndex(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i,needle.length()+i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

}
