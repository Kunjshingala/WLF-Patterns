//  ABCDCBA
//   ABCBA
//    ABA
//     A
public class P39 {
    public static void main(String[] args) {
        char ch = 'd';
        char c = Character.toUpperCase(ch);
        int n = c - 65 + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print((char) (65 + j - 1));
            }
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print((char) (65 + j - 1));
            }
            System.out.println();
        }
    }
}
