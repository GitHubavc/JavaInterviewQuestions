package LeetCodeQuestions;


import java.util.ArrayList;
import java.util.List;

public class FindAllDisappearedElementsInAnArray {
    public static void main(String[] args) {

        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findAllDisappearedElements(nums));

    }

    public static List<Integer> findAllDisappearedElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i= 0;i<nums.length;i++) {
            int index= Math.abs(nums[i])-1;
            if (nums[index]>0) {
                nums[index] = -nums[index];

            }
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>0) {
                ans.add(i+1);
            }
        }
        return ans;
    }
}
