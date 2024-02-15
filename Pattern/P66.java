// ABCBA
// AB BA
// A   A
// AB BA
// ABCBA
public class P66 {
    public static void main(String[] args) {

        char ch = 'c';
        char c = Character.toUpperCase(ch);
        int x = c - 65;

        int n = 2 * x + 1;
        int count;

        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= n; j++) {
                if ((i == 2 || i == 4) && j == 3) {
                    System.out.print(" ");
                } else if (i == 3 && (j == 2 || j == 3 || j == 4)) {
                    System.out.print(" ");
                } else {
                    System.out.print((char) (65 + count - 1));
                }
                if (j < 3) {
                    count++;
                } else {
                    count--;
                }
            }
            System.out.println();
        }

    }
}
