//     A
//    ABA
//   ABCBA
//  ABCDCBA
//   ABCBA
//    ABA
//     A
public class P37 {
    public static void main(String[] args) {
        char ch = 'D';
        char c = Character.toUpperCase(ch);
        int n = c - 65 + 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + j));
            }
            for (int j = i; j > 0; j--) {
                System.out.print((char) (65 + j - 1));
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
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
