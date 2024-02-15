// 1333
// 2222
// 3331
public class P74 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1; j++) {
                if (j < i) {
                    System.out.print(i);
                } else if (i == j) {
                    System.out.print(i);
                } else if (j > i) {
                    System.out.print(n - i + 1);
                }
            }
            System.out.println();
        }
    }
}

// public class P74 {
// public static void main(String[] args) {
// int n = 3;
// for (int i = 0; i < 3; i++) {
// for (int j = 0; j <= i; j++) {
// System.out.print(i+1);
// }
// for (int j = n - i; j > 0; j--) {
// System.out.print(n-i);
// }
// System.out.println();
// }
// }
// }
