/**
 * Returns the smallest multiple of all numbers 1-20 (evenly divisible)
 */
public class SmallestMultiple {
    
    /**
     * @returns true if num is a multiple of all nums between upper bound and lower bound
     */
    public static boolean isMultiple(int num, int upperBound, int lowerBound) {
        // starts at top bound cause more likely to not be divisible so more efficient
        for (int i = upperBound; i >= lowerBound; i--) {
            if (!(num % i == 0)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // iterates until multiple is found
        int upperBound = 20;
        int lowerBound = 1; 
        int possibleMult = upperBound;
        while (true) {
            if (isMultiple(possibleMult, upperBound, lowerBound)) {
                break;
            } else {
                possibleMult++;
            }
        }
        System.out.println(possibleMult);
    }
}
