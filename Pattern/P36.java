//      1
//     121
//    12321
//   1234321
//  123454321
//   1234321
//    12321
//     121
//      1
public class P36 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
