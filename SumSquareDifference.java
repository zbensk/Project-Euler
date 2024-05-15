/**
 * This program prints the difference between the square of the sum of a series of numbers and the sum of the squares of a series of numbers (ex. (1+2+3)^2 - 1^2 + 2^2 + 3^2)
 */
public class SumSquareDifference {
    
    /**
     * @returns the sum of all the squares of a consecutive series of numbers inclusive
     */
    public static int getSumSquares(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i * i;
        }
        return sum;
    }

    /**
     * @returns the square of all the sums of a consecutive series of numbers inclusive
     */
    public static int getSquareSums(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum * sum;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int difference = Math.abs(getSquareSums(start, end) - getSumSquares(start, end));
        System.out.println("Sum square difference: " + difference);
    }
}
