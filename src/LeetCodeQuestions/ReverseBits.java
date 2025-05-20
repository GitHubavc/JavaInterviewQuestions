package LeetCodeQuestions;

public class ReverseBits {
    public static void main(String[] args) {
          int b= 0000001010010;
        System.out.println(reverseBits(b));

    }
    public static int reverseBits(int n){
        return Integer.reverse(n);

    }
}
