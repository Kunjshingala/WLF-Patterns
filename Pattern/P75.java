public class P75 {
    public static void main(String[] args) {
        int n = 5;

        char ch = (char) (65 + n - 1);

        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j + 1);
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(Character.toLowerCase((char) (ch - (n - j -1))));
            }
            System.out.println();
        }
    }
}