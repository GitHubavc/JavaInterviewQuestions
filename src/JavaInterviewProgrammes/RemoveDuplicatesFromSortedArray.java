package JavaInterviewProgrammes;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        int nums[] = {0,0,1,2,2};
        System.out.println(removeDuplicates(nums));

    }
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i= 0; i< nums.length;i++) {
            if (i < nums.length - 1 && nums[i] == nums [i+1]) {
            } else {
                nums[count] = nums[i];
                count ++;
            }
        }
        return count;
    }


}
