// 1
// 121
// 12321
// 1234321
// 123454321
public class P86 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= (2 * i) - 1; j++) {
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
