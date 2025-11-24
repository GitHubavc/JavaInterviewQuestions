package JavaInterviewProgrammes;

public class PalindromeCheckerTrue {
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));                // true
        System.out.println(isPalindrome("hello"));                  // false
        System.out.println(isPalindrome("A man a plan a canal Panama")); // true
    }
}