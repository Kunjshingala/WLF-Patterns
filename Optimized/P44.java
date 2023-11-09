package Optimized;

public class P44 {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {
            int num = 0;
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= n) {
                    num++;
                } else if (j == n + 1) {
                    num = num;
                } else if (j > n) {
                    num--;
                }
                if (j >= n - i + 2 && j <= n + i - 1) {
                    System.out.print("_");
                } else {
                    System.out.print(num);
                }
            }
            System.out.println();
        }
    }
}