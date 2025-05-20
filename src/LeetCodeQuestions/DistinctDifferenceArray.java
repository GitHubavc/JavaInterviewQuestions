package LeetCodeQuestions;

import java.util.Arrays;

public class DistinctDifferenceArray {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        System.out.println(Arrays.toString(distinctDiffArray(nums)));
    }

    public static int[] distinctDiffArray(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];

        for (int i=0; i<n ; i++) {
            int countPrefix = countDistinctElements(nums,0,i);
            int countSuffix = countDistinctElements(nums,i+1,n-1);
            diff[i] =countPrefix-countSuffix;
        }
        return diff;
    }

    public static int countDistinctElements(int[] nums, int start, int end) {
        boolean[] visited = new boolean[100000];
        int count = 0;
        for (int i= start; i<= end ; i++) {
            if(!visited[nums[i]]) {
                visited[nums[i]] = true;
                count ++;
            }
        }
        return count;
    }
}
