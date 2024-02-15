//     1
//    222
//   33333
//  4444444
// 555555555
public class P48 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i + n - 1; j++) {
                if (i + j < n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
