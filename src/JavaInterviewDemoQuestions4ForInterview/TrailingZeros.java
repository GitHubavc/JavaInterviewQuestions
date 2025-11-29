package JavaInterviewDemoQuestions4ForInterview;

public class TrailingZeros {
    public static void main(String[] args) {
        String input = "80087045300712";

        int i = input.length() - 1;

        String trailingZeros = input.substring(i + 1);
        String remaining = input.substring(0, i + 1);

        String formattedOutput = trailingZeros + remaining;

        System.out.println("Formatted output: " + formattedOutput);

    }
}
