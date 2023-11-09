public class P29 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * (n - i) - 1; j > 0; j--) {
                if (j > n - i) {
                    System.out.print(n - (j - n + i));
                } else {
                    System.out.print(n+(j - n + i));
                }
            }
            System.out.println();
        }
    }
}
