// 5
// 454
// 34543
// 2345432
// 123454321
public class P51 {
    public static void main(String[] args) {
        int n = 5;
        int count;
        for (int i = 1; i <= n; i++) {

            count = n - i + 1;

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(count);
                if (j < i) {
                    count++;
                } else {
                    count--;
                }
            }
            System.out.println();

        }
    }
}
