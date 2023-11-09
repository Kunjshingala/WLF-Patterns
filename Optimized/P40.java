package Optimized;

public class P40 {
    public static void main(String[] args) {
        int n = 5;
        int count;
        int row;
        for (int i = 1; i <= 2 * n - 1; i++) {
            count = 1;

            if (i <= n) {
                row = i;
            } else {
                row = (2 * n) - i;
            }

            for (int j = 1; j <= 5; j++) {
                if (i <= n) {
                    if (i + j <= n) {
                        System.out.print(" ");
                    } else {
                        System.out.print((char) (65 + count - 1));
                        count++;
                    }
                } else {
                    if (row + j <= n) {
                        System.out.print(" ");
                    } else {
                        System.out.print((char) (65 + count - 1));
                        count++;
                    }
                }
            }
            System.out.println();
        }
    }
}
