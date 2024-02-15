// 1
// 2*2
// 3*3*3
// 4*4*4*4
// 4*4*4*4
// 3*3*3
// 2*2
// 1
public class P87 {
    public static void main(String[] args) {
        int n = 4;
        int row;
        for (int i = 1; i <= 2 * n; i++) {
            if (i <= n) {
                row = i;
            } else {
                row = 2 * n - i + 1;
            }
            for (int j = 1; j <= 2 * row - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(row);
                }
            }
            System.out.println();
        }
    }

}

// public class P87 {
// public static void main(String[] args) {
// int n = 4;

// for (int i = 0; i < 2 * n; i++) {
// if (i <= n - 1) {
// for (int j = 0; j < 2 * i + 1; j++) {
// if (j % 2 == 0) {
// System.out.print(i + 1);
// } else {
// System.out.print("*");
// }
// }
// } else if (i >= n) {
// for (int j = 0; j < 2 * ((2 * n) - i) - 1; j++) {
// if (j % 2 == 0) {
// System.out.print((2 * n) - i);
// } else {
// System.out.print("*");
// }
// }
// }
// System.out.println();
// }
// }
// }
