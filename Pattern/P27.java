// A
// BB
// CCC
// DDDD
// CCC
// BB
// A
public class P27 {
    public static void main(String[] args) {
        char ch = 'd';
        char c = Character.toUpperCase(ch);
        int n = c - 65 + 1;
        int row;

        for (int i = 1; i <= (2 * n) - 1; i++) {
            if (i <= n) {
                row = i;
            } else {
                row = 2 * n - i;
            }

            for (int j = 1; j <= row; j++) {
                System.out.print((char) (65 + row - 1));
            }
            System.out.println();
        }
    }
}
