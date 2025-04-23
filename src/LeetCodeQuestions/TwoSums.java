package LeetCodeQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Target sum should be : ");
        int target = sc.nextInt();
        int[] arrInput = {2,3,5,6,11,1,5};
        System.out.println(Arrays.toString(twoSumsOutput(arrInput, target)));
        sc.close();

        //i/p= [1,2,3,4,5] target=5 >>> o/p: [1,2]

    }

    public static int[] twoSumsOutput(int[] arr, int sumTarget) {
        int[] num = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sumTarget) {
                    num[0] = i;
                    num[1] = j;
                    break;
                }
            }
        }
        return num;
    }
}
