package JavaInterviewDemoQuestions4ForInterview;

public class FindMissingNumInArray {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,7,8,9};
        int missingNum = findMissNum(array);
        System.out.println("The missing Num is  : "+missingNum);
    }

    private static int findMissNum(int[] array) {
        int n = array.length+1;
        int totalSum = n*(n+1)/2;
        int arraySum= 0;
        for(int num:array) {
            arraySum += num;
        }
        return totalSum-arraySum;
    }
}
