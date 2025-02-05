import java.util.*;

public class EqualArray {
    public static void main(String[] args) {
        int n[] = {100, 20, 30, 50, 10, 160};
        int m[] = {20, 30, 40, 50, 100, 160};

        // Check if both arrays have the same length
        if (n.length != m.length) {
            System.out.println("Array is not equal");
        } else {
            // Check if elements at corresponding indices are equal
            int i;
            for (i = 0; i < n.length; i++) {
                if (n[i] != m[i]) {
                    break; // Found a mismatch, break the loop
                }
            }
            if (i == n.length) {
                System.out.println("Array is equal");
            } else {
                System.out.println("Array is not equal");
            }
        }
    }
}
