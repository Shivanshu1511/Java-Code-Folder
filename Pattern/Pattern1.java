public class Pattern1 {
    public static void main(String[] args) {
        // First part: Upper half of the pattern (Diagonal of stars)
        for (int row = 0; row < 5; row++) {
            // Print spaces before the first star
            for (int i = 0; i < row; i++) {
                System.out.print(" ");
            }
            // Print the first star
            System.out.print("*");

            // Print spaces between stars
            for (int i = 0; i < (5 - row - 1) * 2 - 1; i++) {
                System.out.print(" ");
            }

            // Print the second star, only if it's not the last row
            if (row != 4) {
                System.out.print("*");
            }

            // Move to the next line after printing a row
            System.out.println();
        }
    }
}
