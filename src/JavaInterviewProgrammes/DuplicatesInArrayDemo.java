package JavaInterviewProgrammes;

import java.util.Arrays;

public class DuplicatesInArrayDemo {
    public static void main(String[] args) {
        int[] inputArray = {2, 3, 5, 7, 8, 9, 6,5};
        findDuplicatesInArray(inputArray);
        findDuplicatesUsingSorting(inputArray);
    }

    //using bruteforce method for inside for which is time consuming.
    private static void findDuplicatesInArray(int[] arr){
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] == arr[i]) {
                    System.out.println("The duplicate element is : " + arr[i]);
                }
            }
        }
    }

    //using sorting method
    private static void findDuplicatesUsingSorting(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("Duplicate element via sorting is : "+arr[i]);
            }

        }
    }

}
