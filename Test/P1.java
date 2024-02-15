package Test;

public class P1 {

    public static void main(String[] args) {
        int n = 6;
        int count;

        for (int i = 1; i <= n; i++) {
            count = 1;

            for (int j = 1; j <= 2 * (n - i + 1); j++) {
                System.out.print((char) (65 + count - 1) + " ");
                if (j < n - i + 1) {
                    count++;
                } else if (j == n - i + 1) {
                    count = count;
                } else {
                    count--;
                }
            }
            System.out.println();
        }
    }
}
