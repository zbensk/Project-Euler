/**
 * Given a number num, this program returns the largest prime factor
 * 1 is not included
 */
public class LargestPrimeFactor {
    public static void main(String[] args) {
        long num = 600_851_475_143L;
        num = 131950000000L;
        long lpf = 1;
        long factor = 1;

        // Only check odds to minimize search time, but check two individually b/c its the only odd prime
        // Also, since I only care about the largest prime factor, I can search from num / 2 and go down, returning the lpf once I get one b/c it must be the largest

        for (long i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                factor = num / i;
                if (isPrime(factor)) {
                    lpf = factor;
                    break;
                }
            }
        }
        System.out.println("Largest prime factor: " + lpf);
    }

    public static boolean isPrime(long n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}   