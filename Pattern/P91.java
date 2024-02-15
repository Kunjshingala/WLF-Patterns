// 543212345
//  4321234
//   32123
//    212
//     1
public class P91 {
    public static void main(String[] args) {
        int n = 5;
        int row, count;
        for (int i = 1; i <= n; i++) {

            row = n - i;
            count = row + 1;

            for (int j = 1; j <= n + row; j++) {

                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print(count);
                    if (j < n) {
                        count--;
                    } else if (j >= n) {
                        count++;
                    }
                }

            }
            System.out.println();
        }
    }
}

// public class P91 {
// public static void main(String[] args) {
// int n = 5;
// int count;
// for (int i = 0; i < n; i++) {
// count = 5 - i;
// for (int j = 0; j < i; j++) {
// System.out.print(" ");
// }
// for (int j = (2 * (n - i)) - 1; j > 0; j--) {
// if (j > n) {
// System.out.print(count + " ");
// count--;
// } else if (j <= n) {
// System.out.print(count + " ");
// count++;
// }
// }
// System.out.println();
// }
// }
// }
