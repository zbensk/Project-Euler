/**
 * Prints out the nth prime (ex 13 is the 6th prime number)
 */
public class OrderedPrime {
    /**
     * @returns true if number is prime
     */
    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10001;
        int currentPrime = 1; // starts with 2 being already determined as prime (number of primes determined)
        int num = 1; // number to check
        while (currentPrime != n) {
            num += 2;
            if (isPrime(num)) {
                currentPrime++;
            }
            
        }

        System.out.println(num + " is the " + n + "th prime number");
    }
}
