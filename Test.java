/**
 * Test
 */

public class Test {

    public static void main(String[] args) {
        int n = 5;
        int count;
        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= n; j++) {
                if (i+j<n+1) {
                    System.err.print(" ");
                }else{
                    System.err.print(count+" ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}

// public class Test {
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

// public class Test {
// public static void main(String[] args) {
// int n = 4;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= 2 * n + 1; j++) {
// if ((j == i) || (j == n + 1) || (i + j == 2 * (n + 1))) {
// System.out.print("+");
// } else {
// System.out.print("0");
// }
// }
// System.out.println();
// }
// }
// }

// public class Test {

// public static void main(String[] args) {
// int n = 5;
// int count;

// for (int i = 1; i <= n; i++) {
// count = 1;

// for (int j = 1; j <= n; j++) {
// if (j < i) {
// System.out.print(" ");
// } else {
// System.out.print(count);
// count++;
// }
// }
// System.out.println();
// }
// }
// }

// public class Test {
// public static void main(String[] args) {
// int n = 4;
// int row;
// int count;

// for (int i = 1; i <= 2 * n - 1; i++) {
// count = n;

// if (i <= n) {
// row = i;
// } else {
// row = 2 * n - i;
// }

// for (int j = 1; j <= n + row - 1; j++) {
// if (i <= n) {
// if (j + row < n + 1) {
// System.out.print(" ");
// } else {
// System.out.print(count);
// }

// if (j < n) {
// count--;
// } else {
// count++;
// }

// } else if (i > n) {
// if (j + row < n + 1) {
// System.out.print(" ");
// } else {
// System.out.print(count);
// }

// if (j < n) {
// count--;
// } else {
// count++;
// }
// }
// }
// System.out.println();
// }
// }
// }