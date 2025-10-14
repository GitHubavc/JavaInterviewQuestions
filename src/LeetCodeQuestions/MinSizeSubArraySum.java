package LeetCodeQuestions;

public class MinSizeSubArraySum {
    public static void main(String[] args) {

        int nums[] = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArraySum(nums,target));

    }
    public static int minSubArraySum(int[] nums,int target) {
        int currentSum= 0;
        int low = 0;
        int high = 0;
        int minLenWin = Integer.MAX_VALUE;

        for(high=0;high<nums.length;high++) {
            currentSum += nums[high];
            while(currentSum>= target) {
                 int currentWin = high-low+1;
                 minLenWin = Math.min(minLenWin,currentWin);
                 currentSum = currentSum-nums[low];
                 low++;
            }
        }
        return minLenWin == Integer.MAX_VALUE ? 0 : minLenWin;
    }
}
