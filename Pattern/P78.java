public class P78 {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == n - 1) || (i == m - 1 && j == 0)
                        || (i == m - 1 && j == n - 1)) {
                    System.out.print(" ");

                } else if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
