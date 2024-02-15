// 12344321
// 123--321
// 12----21
// 1------1

public class P44 {
    public static void main(String[] args) {
        int n = 4;
        int count;

        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= n) {
                    if (i + j > n + 1) {
                        System.out.print("-");
                    } else {
                        System.out.print(count);
                    }
                } else if (j > n) {
                    if (j - i < n) {
                        System.out.print("-");
                    } else {
                        System.out.print(count);
                    }
                }
                if (j < n) {
                    count++;
                } else if (j == n) {
                    continue;
                } else {
                    count--;
                }
            }
            System.out.println();
        }
    }
}