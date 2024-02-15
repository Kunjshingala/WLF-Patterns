// ABCDDCBA
// ABCCBA
// ABBA
// AA
public class P47 {

    public static void main(String[] args) {

        char ch = 'd';
        char c = Character.toUpperCase(ch);
        int n = c - 65 + 1;
        int count;

        for (int i = n; i >= 1; i--) {
            count = 1;
            for (int j = 1; j <= 2 * i; j++) {
                System.err.print((char) (65 + count - 1));
                if (j < i) {
                    count++;
                } else if (j == i) {
                    continue;
                } else {
                    count--;
                }
            }
            System.out.println();
        }
    }
}
