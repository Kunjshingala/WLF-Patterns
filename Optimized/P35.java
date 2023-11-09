
package Optimized;

public class P35 {
    public static void main(String[] args) {
        int n = 4;
        int row, count;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                row = i;
            } else {
                row = 2 * n - i;
            }
            count = n;
            for (int j = 1; j <= n + row - 1; j++) {
                if (i <= n) {
                    if (row + j < n + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(count);
                    }
                    if (j < n) {
                        count--;
                    } else {
                        count++;
                    }
                } else {
                    if (row + j < n + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(count);
                    }
                    if (j < n) {
                        count--;
                    } else {
                        count++;
                    }
                }
            }
            System.out.println();
        }
    }
}