//     1
//    21
//   321
//  4321
// 54321
public class P30 {
    public static void main(String[] args) {
        int n = 5;
        int count;

        for (int i = 1; i <= n; i++) {
            count = 5;
            for (int j = 1; j <= n; j++) {
                if (i + j < n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(count);
                }
                count--;
            }
            System.out.println();
        }
    }
}
