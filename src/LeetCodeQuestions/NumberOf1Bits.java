package LeetCodeQuestions;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int num=11;
        System.out.println(hammingWeight(num));

    }
    public static int hammingWeight(int n){
        int count=0;
        while (n>0){
            int rem= n%2;
            count+=rem;
            n/=2;
        }
        return count;
    }
}
