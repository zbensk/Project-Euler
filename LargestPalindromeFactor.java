/**
 * This program finds the largest palindrome made from the product of two 3-digit numbers
 */
public class LargestPalindromeFactor {
    
    /**
     * @returns true if the given number is palindromic
     */
    public static boolean isPalindrome(int num) {
        // convert to string, then use loop to check for palindrome
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length() / 2; i++) {
            String dig1 = numStr.substring(i, i + 1);
            String dig2 = numStr.substring(numStr.length() - i - 1, numStr.length() - i);
            if (!dig1.equals(dig2)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int biggestPalindrome = 0;
        int lowerBound = 100;
        int upperBound = 999;
        for (int i = lowerBound; i <= upperBound; i++) {
            for (int j = lowerBound; j <= upperBound; j++) {
                int product = i * j;
                if (isPalindrome(product) && product > biggestPalindrome) {
                    biggestPalindrome = product;
                }
            }
        }

        System.out.println(biggestPalindrome);
        
    }
}
