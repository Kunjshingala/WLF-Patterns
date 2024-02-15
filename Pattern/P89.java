// 7
// 14 15
// 28 29 30 31
// 56 57 58 59 60 61 62 63
public class P89 {
    public static void main(String[] args) {
        int x = 7;
        int n = 4;
        int col = 1;

        for (int i = 1; i <= n; i++) {
            int count = x;
            for (int j = 1; j <= col; j++) {
                System.out.print(count + " ");
                count++;
            }
            col = 2 * col;
            x = 2 * x;

            System.out.println();
        }
    }
}

// public class P89 {
// public static void main(String[] args) {
// int x = 7;
// int n = 4;

// int count1 = 1;

// for (int i = 0; i < n; i++) {
// int count2 = x;
// for (int j = 0; j < count1; j++) {
// System.out.print(count2 + " ");
// count2++;
// }
// count1 = count1 * 2;
// x = 2 * x;
// System.out.println();
// }
// }
// }
