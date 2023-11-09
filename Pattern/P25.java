public class P25 {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 0; i < 2 * n - 1; i++) {
            if (i <= 4) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(i + 1);
                }
            } else {
                for (int j = (2 * n) - i - 1; j > 0; j--) {
                    System.out.print((2 * n) - i - 1);
                }
            }
            System.out.println();
        }
    }
}
