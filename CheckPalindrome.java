import java.util.Scanner;

public class CheckPalindrome {

    public boolean isPalindrome(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while(start < end) {
            if(charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
        CheckPalindrome check = new CheckPalindrome();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter word to check if palindrome");
        String word = userInput.nextLine();

        if(check.isPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        }
        else {
            System.out.println(word + " is not a palindrome");
        }

        userInput.close();

    }
}
