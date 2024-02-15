//    1
//   121
//  12321
// 1234321
//  12321
//   121
//    1
package Optimized;
public class P36 {
    public static void main(String[] args) {
        int n = 4;
        int row;

        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                row = i;
            } else {
                row = 2 * n - i;
            }

            int count = 1;
            for (int j = 1; j <= n + row - 1; j++) {      
                    if (row + j < n + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(count);
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

// for (int i = 0; i < 2 * n - 1; i++) {
// if (i < n) {
// row = i;
// } else {
// row = 2 * (n - 1) - i;
// }

// // System.out.print(i + "->" + row + " ");

// for (int j = 0; j < n + row; j++) {
// if ((i < n && j < n - row - 1) || (i >= n && j < n - row - 1)) {
// System.out.print(" ");
// } else {
// if (j < n) {
// System.out.print(j-(n-row)+2);
// } else {
// System.out.print(n - (j - row));
// }

// }
// }

// System.out.println();
// }