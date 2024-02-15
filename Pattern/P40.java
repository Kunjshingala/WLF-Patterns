//     A
//    AB
//   ABC
//  ABCD
// ABCDE
//  ABCD
//   ABC
//    AB
//     A
public class P40 {
    public static void main(String[] args) {

        char ch = 'e';
        char c = Character.toUpperCase(ch);
        int n = c - 65 + 1;
        int row, count;

        for (int i = 1; i <= 2 * n - 1; i++) {
            count = 1;

            if (i <= n) {
                row = i;
            } else {
                row = 2 * n - i;
            }

            for (int j = 1; j <= n; j++) {
                if (row + j < n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print((char) (65 + count - 1));
                    count++;
                }
            }
            System.out.println();
        }
    }
}