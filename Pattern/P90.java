// 00000*00000
// 0000*0*0000
// 000*000*000
// 00*00000*00
// 0*0000000*0
// *000000000*
public class P90 {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j <= n) {
                    if (i + j == n + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print("0");
                    }
                } else if (j > n) {
                    if (j - i == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
    }
}

// public class P90 {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 0; i < n; i++) {

// for (int j = n - i; j > 0; j--) {
// System.out.print("# ");
// }

// if (i == 0) {
// System.out.print("");
// } else {
// System.out.print("@ ");
// }

// for (int j = 0; j < (2 * i) - 1; j++) {
// System.out.print("# ");
// }

// System.out.print("@ ");
// for (int j = n - i; j > 0; j--) {
// System.out.print("# ");
// }

// System.out.println();
// }
// }
// }
