package JavaInterviewDemoQuestions4ForInterview;

public class OddEvenNumInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,11,13,15,17,19,20};
        int[] count = countOddEvenArray(array);
        System.out.println("Even Count : "+count[1]);
        System.out.println("Odd Count : "+count[0]);

    }

    private static int[] countOddEvenArray(int[] array) {
        int[] count = new int[2];
        for (int num:array) {
            if(num%2 ==0) {
                count[1]++;
            } else {
                count[0]++;
            }
        }
        return count;
    }
}
