// A
// 1
// BB
// 22
// CCC
// 333
public class P96 {
    public static void main(String[] args) {
        int n = 3;
        int count1 = 1;

        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= count1; j++) {
                if (i % 2 != 0) {
                    System.out.print((char) (65 + count1 - 1));
                } else {
                    System.out.print(count1);
                }
            }
            if (i % 2 == 0) {
                count1++;
            }
            System.out.println();
        }
    }
}

// public class P96 {
// public static void main(String[] args) {
// int n = 3;
// int count = 1;
// char ch = 65;

// for (int i = 0; i < 2 * n; i++) {
// for (int j = 0; j < count; j++) {
// if (i % 2 == 0) {
// System.out.print((char) (ch + count - 1));
// } else {
// System.out.print(count);
// }
// }
// if (i % 2 != 0) {
// count++;
// }
// System.out.println();
// }
// }
// }
