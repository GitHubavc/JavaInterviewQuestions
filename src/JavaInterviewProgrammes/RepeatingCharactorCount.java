package JavaInterviewProgrammes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatingCharactorCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here : ");
        String words = sc.nextLine();
        String result = repeatingCharactorCount(words);

        if (result == null) {
            System.out.println("No repeating characters found.");
        } else {
            System.out.println("No of Repeating Characters and their count are:\n" + result);
        }

        sc.close();
    }

    private static String repeatingCharactorCount(String words) {
        // Convert to lowercase and remove all spaces
        words = words.toLowerCase().replaceAll("\\s+", "");

        // Map to store each character and its frequency
        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char c : words.toCharArray()) {
            if (charCount.containsKey(c)) {
                // If already present, increment the count by 1
                int currentCount = charCount.get(c);
                charCount.put(c, currentCount + 1);
            } else {
                // If not present, add to map with count = 1
                charCount.put(c, 1);
            }
        }

        // Build result for characters that appear more than once
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                result.append("char: ").append(entry.getKey())
                        .append(" count = ").append(entry.getValue())
                        .append(";\n");
            }
        }

        // If no repeating characters, return null
        if (result.isEmpty()) {
            return null;
        }

        return result.toString();
    }
}
