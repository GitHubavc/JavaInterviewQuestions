package LeetCodeQuestions;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int number=5;
        System.out.println(Arrays.toString(countBits(number)));

    }
    public static int[] countBits(int n){
        int[] ans= new int[n+1];
        for(int i=0;i<=n;i++){
            int count=0;
            int num=i;
            while(num!=0){
                count = count+(num &1);
                num>>=1;
            }
            ans[i]=count;

        }
        return ans;

    }
}
