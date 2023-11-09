public class P24 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {

            int ch = 'E';
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = (2 * (n - i)) - 1; j > 0; j--) {
                if (j > n - i) {
                    char k = (char) (ch - (j - n + i));
                    System.out.print(k + " ");
                } else {
                    char k = (char) (ch + (j - n + i));
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }
    }
}
