package JavaInterviewProgrammes;

import java.util.*;

public class CheckPalindromeForList {
    public static void main(String[] args) {
        // List of strings
        List<String> words = Arrays.asList("madam", "apple", "racecar", "level", "python");

        // Check each word
        for (String word : words) {
            System.out.println(word + " → " + isPalindrome(word));
        }
    }

    // Function to check if a string is a palindrome
    public static String isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return "Not Palindrome";
            }
            left++;
            right--;
        }
        return "Palindrome";
    }
}

