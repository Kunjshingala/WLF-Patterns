// 123454321
//  2345432
//   34543
//    454
//     5
public class P29 {
    public static void main(String[] args) {
        int n = 5;
        int count;
        for (int i = n; i >= 1; i--) {
            count = 1;
            for (int j = 1; j <= n + i - 1; j++) {
                if (i + j < n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(count);
                }
                if (j < n) {
                    count++;
                } else {
                    count--;
                }
            }
            System.out.println();
        }
    }
}
