package LeetCodeQuestions;

public class MaximumProductSubArray {
    public static void main(String[] args) {

        int[] arr= {2,3,-2,-5,6,-1,4};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums){
        int n= nums.length;
        int leftProduct=1;
        int rightProduct=1;
        int ans =nums[0];

        for(int i= 0; i<n;i++){
            //if any of left product or right product become 0 them update it to 1;
            leftProduct=leftProduct==0 ? 1 : leftProduct;
            rightProduct=rightProduct==0 ? 1 : rightProduct;

            //prefix product
            leftProduct *=nums[i];

            //suffix product
            rightProduct *= nums[n-1-i];

            ans=Math.max(ans,Math.max(leftProduct,rightProduct));
        }
        return ans;
    }
}
