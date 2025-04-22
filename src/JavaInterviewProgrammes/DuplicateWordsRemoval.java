package JavaInterviewProgrammes;

import java.util.*;

public class DuplicateWordsRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        String[] inputArr = str.split(" ");
        Set<String> mySet = new LinkedHashSet<String>();

        for (String x : inputArr) {
            mySet.add(x);
        }
        Iterator itr = mySet.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }
}
