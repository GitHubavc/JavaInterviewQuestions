package LeetCodeQuestions;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        int a=9,b=3;
        System.out.println(getSum(a,b));

    }

    public static int getSum(int a,int b){

        while(b !=0){
            int sum= a ^ b;
            int carry= (a & b) << 1;
            a = sum;
            b=carry;
        }
        return a;
    }
}
