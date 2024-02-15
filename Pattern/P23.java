//      A
//     ABA
//    ABCBA
//   ABCDCBA
//  ABCDEDCBA
public class P23 {
    public static void main(String[] args) {
        int n = 5;
        int count;

        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= n + i - 1; j++) {
                if (i + j < n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print((char) (65 + count - 1));
                    if (j < n) {
                        count++;
                    } else {
                        count--;
                    }
                }
            }
            System.out.println();
        }
    }
}
