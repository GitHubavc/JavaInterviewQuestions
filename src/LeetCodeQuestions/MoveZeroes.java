package LeetCodeQuestions;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);

        for (int num:nums) {
            System.out.print(num + " ");
        }

    }

    public static void moveZeros(int[] num) {
        int count = 0;
        for (int i= 0;i<num.length;i++) {
            if(num[i] != 0) {
                num[count++] = num[i];
            }
        }
        while (count<num.length) {
            num[count++] = 0;
        }
    }
}
