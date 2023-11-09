public class P87 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < 2 * n; i++) {
            if (i <= n - 1) {
                for (int j = 0; j < 2 * i + 1; j++) {
                    if (j % 2 == 0) {
                        System.out.print(i + 1);
                    } else {
                        System.out.print("*");
                    }
                }
            } else if (i >= n) {
                for (int j = 0; j < 2 * ((2 * n) - i) - 1; j++) {
                    if (j % 2 == 0) {
                        System.out.print((2 * n) - i);
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
