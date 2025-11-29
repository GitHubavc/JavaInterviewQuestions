package JavaInterviewDemoQuestions4ForInterview;

public class SumOfOnlyTheIntegersInString {
    public static void main(String[] args) {
        String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
        int sum = sumIntegers(array);
        System.out.println("sum of Integers in the array : " +sum);
    }

    private static int sumIntegers(String[] array) {
        int sum = 0;
        for (String element:array) {
            try {
                int num = Integer.parseInt(element);
                sum += num;
            } catch (NumberFormatException ignored) {
            }
        }
        return sum;
    }
}
