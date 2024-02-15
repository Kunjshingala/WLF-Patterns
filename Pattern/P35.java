//     1
//    212
//   32123
//  4321234
// 543212345
//  4321234
//   32134
//    214
//     1

public class P35 {
    public static void main(String[] args) {
        int n = 5;
        int count;
        int row;

        for (int i = 1; i <= 2 * n - 1; i++) {
            count = n;

            if (i <= n) {
                row = i;
            } else {
                row = 2 * n - i;
            }

            System.out.print(i + "->" + row + " ");

            for (int j = 1; j <= n + row - 1; j++) {
                if (row + j < n + 1) {
                    System.err.print(" ");
                } else {
                    System.err.print(count);
                }
                if (j < n) {
                    count--;
                } else {
                    count++;
                }
            }
            System.out.println();
        }
    }
}
