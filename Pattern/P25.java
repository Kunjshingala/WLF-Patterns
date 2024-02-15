// 1
// 22
// 333
// 4444
// 55555
// 4444
// 333
// 22
// 1
public class P25 {
    public static void main(String[] args) {
        int n = 5;
        int row;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i < n) {
                row = i;
            } else {
                row = 2 * n - i;
            }
            for (int j = 1; j <= row; j++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
