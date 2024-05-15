import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Given a text file with a 20x20 grid of numbers, read the file and return the greatest product of 4 adjacent numers (horizontally, vertical, diagonally)
 */
public class LargestProductInGrid {
    private static final int ROWS = 20;
    private static final int COLS = 20;
    private static final int NUM_ADJACENT = 4; // number of adjacent squares to look for
    private static int[][] grid;

    public static int[][] convertFileToArray(File file) {
        ArrayList<String> stringRows = new ArrayList<String>();
        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                stringRows.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }

        grid = new int[ROWS][COLS]; // 20x20 grid
        for (int r = 0; r < stringRows.size(); r++) {
            String row = stringRows.get(r);
            String[] splitRow = row.split(" ");
            for (int c = 0; c < splitRow.length; c++) {
                grid[r][c] = Integer.parseInt(splitRow[c]);
            }
        }

        return grid;
    }

    public static void printGrid(int[][] grid) {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                System.out.print(grid[r][c] + " ");
            }
            System.out.println();
        }
    }

    /**
     * @returns the greatest product of the horizontal, vertical, and diagonal (if applicable) for the given square, though border checking will be done
     */
    public static long getProduct(int row, int col) {
        long greatestProd = 1;
        // horizontal
        if (col + NUM_ADJACENT <= COLS) {
            long prod = 1;
            for (int c = col; c < col + NUM_ADJACENT; c++) {
                prod *= grid[row][c];
            }
            if (prod > greatestProd) {
                greatestProd = prod;
            }
        }

        // vertical
        if (row + NUM_ADJACENT <= ROWS) {
            long prod = 1;
            for (int r = row; r < row + NUM_ADJACENT; r++) {
                prod *= grid[r][col];
            }
            if (prod > greatestProd) {
                greatestProd = prod;
            }
        }

        // diagonal right
        if (row + NUM_ADJACENT <= ROWS && col + NUM_ADJACENT <= COLS) {
            long prod = 1;
            for (int i = 0; i < NUM_ADJACENT; i++) {
                prod *= grid[row + i][col + i];
            }
            if (prod > greatestProd) {
                greatestProd = prod;
            }
        }

        // diagonal left
        if (row + NUM_ADJACENT <= ROWS && col - NUM_ADJACENT >= 0) {
            long prod = 1;
            for (int i = 0; i < NUM_ADJACENT; i++) {
                prod *= grid[row + i][col - i];
            }
            if (prod > greatestProd) {
                greatestProd = prod;
            }
        }
        return greatestProd;
    }

    public static void main(String[] args) {
        File input = new File("prodInGrid.txt");
        grid = convertFileToArray(input);
        long greatestProd = 1;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                long product = getProduct(r, c);
                if (product > greatestProd) {
                    greatestProd = product;
                }
            }
        }

        System.out.println(greatestProd);
    }
}
