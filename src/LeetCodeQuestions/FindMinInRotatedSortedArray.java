package LeetCodeQuestions;

public class FindMinInRotatedSortedArray {
    public static void main(String[] args) {

        int[] arr= {4,5,6,7,0,1,2};
        System.out.println(findMinElement(arr));

    }

    public static int findMinElement(int[] nums){
        int left=0;
        int right = nums.length-1;

        while(left<right){
            int mid =left+(right-left)/2;
            //check if middle is greater than right element
            if(nums[mid]>nums[right]){
                left = mid+1;
            }else{
                right=mid;
            }
        }
        return nums[left];
    }

}
