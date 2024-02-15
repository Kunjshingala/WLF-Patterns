// // 1    *
// // 2   ***
// // 3  *****
// // 4 *******
// // 3  *****
// // 2   ***
// // 1    *

package Optimized;

public class P34 {
    public static void main(String[] args) {
        int n = 4;
        int row;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                row = i;
            } else {
                row = 2 * n - i;
            }
            for (int j = 1; j <= n + row - 1; j++) {
                if (row + j < n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}