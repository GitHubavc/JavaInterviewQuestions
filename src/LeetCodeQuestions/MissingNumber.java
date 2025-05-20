package LeetCodeQuestions;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr= {0,1,2,4,5,7,6,8};
        System.out.println(missingNumber(arr));

    }
    public static int missingNumber(int nums[]){

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int actualSum= (nums.length*(nums.length+1)/2);
        int missingNum= actualSum-sum;
        return missingNum;

    }

}
