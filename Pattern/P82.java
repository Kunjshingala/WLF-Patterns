// * *** *** *
// ** ** ** **
// *** * * ***
public class P82 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4 * n - 1; j++) {
                if ((j - i == 1) || (j == 2 * n) || (i + j == 4 * n - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
