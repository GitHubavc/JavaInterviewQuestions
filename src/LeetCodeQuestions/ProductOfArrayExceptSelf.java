package LeetCodeQuestions;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));

    }

    public static int[] productExceptSelf(int[] nums){
        int[] leftProduct=new int[nums.length];
        int[] rightProduct=new int[nums.length];
        int[] result=new int[nums.length];

        for(int i=0,temp=1;i<nums.length;i++){
            leftProduct[i]=temp;
            temp*=nums[i];
        }
        for(int i=nums.length-1,temp=1;i>=0;i--){
            rightProduct[i]=temp;
            temp*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            result[i]=leftProduct[i]*rightProduct[i];
        }
        return result;
    }
}
