package Optimized;

public class P41 {
    public static void main(String[] args) {
        int n = 5;
        int row;
        int count;
        for (int i = 1; i <= 2 * n - 1; i++) {

            if (i <= n) {
                row = i;
            } else {
                row = (2 * n) - i;
            }

            count = row;
            
            for (int j = 1; j <= n; j++) {
                if (j <= row) {
                    System.out.print((char) (65 + count - 1));
                    count--;
                }
            }
            System.out.println();
        }
    }
}
