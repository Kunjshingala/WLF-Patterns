// 33333
// 32223
// 32123
// 32223
// 33333
public class P53 {
    public static void main(String[] args) {

        int n = 3;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {

                int top = i - 1;
                int bottom = 2 * n - i - 1;
                int left = j - 1;
                int right = 2 * n - j - 1;
                int k = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(n - k + " ");

            }
            System.out.println();
        }
    }
}