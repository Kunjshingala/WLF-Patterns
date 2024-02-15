//     1 
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1

public class P21 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }

            int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = k * (i - j) / j;
            }
            System.out.println();
        }
    }
}

// public class P21 {
// public static void main(String[] args) {
// int n = 4;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n; j++) {
// if (i + j < n + 1) {
// System.out.print(" ");
// } else {
// if (i + j == n + 1 || j == n) {
// System.out.print("1 ");
// } else {
// System.out.print(i - 1 + " ");
// }
// }
// }
// System.out.println();
// }
// }
// }