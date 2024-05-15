/**
 * Return the sum of all integers that are multiples of 3 and/or 5 below a value max
 */
public class Multiple3or5 {
    public static void main(String[] args) {
        int max = 1000;
        int total = 0;

        for (int i = 1; i < max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
    
}
