package JavaInterviewProgrammes;

public class ReverseWordsAndLetters {
    public static void main(String[] args) {
        String input = "HOW ARE YOU ANU";
        String output = reverseWordsAndLetters(input);
        System.out.println(output);
    }

    public static String reverseWordsAndLetters(String str) {
        // Split the input string into words
        String[] words = str.split(" ");

        // Use StringBuilder for efficient string reversal
        var reversed = new StringBuilder();

        // Iterate words from last to first
        for (int i = words.length - 1; i >= 0; i--) {
            // Reverse each word and append it
            reversed.append(new StringBuilder(words[i]).reverse());

            // Add space between words (except after the last one)
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
