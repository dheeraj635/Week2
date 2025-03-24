public class PalindromeChecker {
    String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: The text is a palindrome.");
        } else {
            System.out.println("Result: The text is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("madam");
        checker1.displayResult();

        System.out.println();

        PalindromeChecker checker2 = new PalindromeChecker("Hello World");
        checker2.displayResult();
    }
}



