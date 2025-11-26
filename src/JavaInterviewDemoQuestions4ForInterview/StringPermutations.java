package JavaInterviewDemoQuestions4ForInterview;

public class StringPermutations {

    public static void main(String[] args) {
        String str = "AARAV";
        System.out.println("Permutations of " + str + ":");
        generatePermutations(str, "");
    }

    // Recursive function to generate permutations
    private static void generatePermutations(String remaining, String permutation) {
        // Base condition: when no characters left, print permutation
        if (remaining.isEmpty()) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            // Choose the current character
            char currentChar = remaining.charAt(i);

            // Remaining string without chosen character
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);

            // Recurse with updated remaining + permutation
            generatePermutations(newRemaining, permutation + currentChar);
        }
    }
}

