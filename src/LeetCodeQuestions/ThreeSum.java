package LeetCodeQuestions;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr= {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));

    }

    public static List<List<Integer>> threeSum(int[] nums){
        if (nums.length<3){
            return new ArrayList<>();
        }
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k = nums.length-1;

            while(j<k){
                int sum= nums[i]+nums[j]+nums[k];
                List<Integer> list = new ArrayList<>();
                if(sum==0){
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    j++;
                    k--;
                    result.add(list);
                } else if (sum>0) {
                    k--;

                }else {
                    j++;
                }
            }
        }
    return  new ArrayList<List<Integer>>(result);
    }
}
