public class P82 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}