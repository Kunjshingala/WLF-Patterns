// +
// ++
// +++
// ++++
// +++
// ++
// +
public class P63 {
    public static void main(String[] args) {
        int n = 4;
        int row;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                row = i;
            } else {
                row = 2 * n - i;
            }
            for (int j = 1; j <=row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
