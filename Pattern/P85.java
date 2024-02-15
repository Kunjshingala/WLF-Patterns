// 1
// 121
// 1231
// 12341
// 123451

public class P85 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            if (i > 1) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}

// public class P85 {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 0; i < n; i++) {
// if (i == 0) {
// System.out.print("1");
// } else {
// System.out.print("1");
// for (int j = 0; j < i; j++) {
// System.out.print(j + 2);
// }
// System.out.print("1");
// }
// System.out.println();
// }
// }
// }
