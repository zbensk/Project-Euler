/**
 * This program sums all primes under a certain max number
 */
public class SummationOfPrimes {
    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int max = 2000000;
        long sum = 0;
        for (int i = 2; i < max; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Sum of all primes below " + max + ": " + sum);
    }
}
