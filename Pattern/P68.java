// 1234
// 2341
// 3412
// 4123

public class P68 {
    public static void main(String[] args) {
        int n = 4;
        int count;
        for (int i = 1; i <= n; i++) {
            count = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(count);
                if (count == 4) {
                    count = 1;
                } else {
                    count++;
                }
            }
            System.out.println();
        }
    }
}

// public class P68 {
// public static void main(String[] args) {
// int n = 4;

// for (int i = 0; i < n; i++) {
// int count = i + 1;
// for (int j = n - i; j > 0; j--) {
// System.out.print(count + " ");
// count++;
// }
// for (int j = 0; j < i; j++) {
// System.out.print((j + 1) + " ");
// }
// System.out.println();
// }
// }
// }
