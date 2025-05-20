package LeetCodeQuestions;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] numbers = {3,4,5,2,1};
        System.out.println(maxConsecutiveOnes(numbers));
    }
    public static int maxConsecutiveOnes(int[] numArray) {
        int count = 0;
        int max_count = 0;
        for (int i=0; i<numArray.length; i++) {
            if (numArray[i] == 1) {
                count ++;
                max_count = Math.max(max_count,count);
            } else {
                count = 0;
            }

        }
        return  max_count;

    }
}
