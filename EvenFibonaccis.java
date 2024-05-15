/**
 * This program calculates the sum of all the even fibonacci numbers below a maximum value
 */
public class EvenFibonaccis {
    public static void main(String[] args) {
        int total = 0;
        int maxValue = 4_000_000;

        int secondLast = 0;
        int last = 1;
        int temp = 0;
        while (temp <= maxValue) {
            if (temp % 2 == 0) {
                total += temp;
            }

            temp = last + secondLast;
            secondLast = last;
            last = temp;
            
            // System.out.println(last);
        }

        System.out.println(total);

    }

}
