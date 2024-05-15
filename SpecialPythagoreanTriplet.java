/**
 * Returns the product of a, b, and c, who are pythagorean triplets, and sum to 1000
 */
public class SpecialPythagoreanTriplet {
    /**
     * @returns true if a, b, and c are a pythagorean triplet
     */
    public static boolean isTriplet(int a, int b, int c) {
        return (a*a + b*b == c*c);
    }

    public static void main(String[] args) {
        int sum = 1000;
        for (int a = 1; a < sum; a++) {
            for (int b = 1; b < sum; b++) {
                for (int c = 1; c < sum; c++) {
                    if (a < b && b < c) {
                        if (a + b + c == sum && isTriplet(a, b, c)) {
                            System.out.println("Pythagorean Triplet: " + a + ", " + b + ", " + c);
                            System.out.println("Product: " + (a * b * c));
                        }
                    }
                }
            }
        }
    }
    
}
