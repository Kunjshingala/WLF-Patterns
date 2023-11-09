public class P94 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("0 ");
            }
            System.out.print("+ ");
            for (int j = 0; j < 2 * (n - i - 1) + 1; j++) {
                if (j == n - i - 1) {
                    System.out.print("+ ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.print("+ ");
            for (int j = 0; j < i; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
