package Optimized;

public class P37 {
    public static void main(String[] args) {
        char ch = 'd';
        char c = Character.toUpperCase(ch);
        int n = c - 65 + 1;
        int row;
        int count;

        for (int i = 1; i <= 2 * n - 1; i++) {

            if (i < n) {
                row = i;
            } else {
                row = 2 * n - i;
            }

            count = 1;

            for (int j = 1; j <= n + row - 1; j++) {
                if (row <= n) {
                    if (row + j < n + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print((char) (65 + count - 1));
                        if (j < n) {
                            count++;
                        } else {
                            count--;
                        }
                    }
                } else {
                    if (row + j < n + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print((char) (65 + count - 1));
                        if (j < n) {
                            count++;
                        } else {
                            count--;
                        }
                    }
                }
            }
            System.out.println();
        }

    }
}

// for (int j = 0; j < n + row; j++) {
// if ((j < n && j < n - row - 1) || (j >= n && j < n - row - 1)) {
// System.out.print(" ");
// } else {
// if (j < n) {
// // System.out.print(" ");
// System.out.print((char) (c - (2 * (n - 1) - (j + row))));
// } else {
// System.out.print((char) (c - (j - row)));
// }
// }

// }
// System.out.println();
// }