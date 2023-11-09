public class P91 {
    public static void main(String[] args) {
        int n = 5;
        int count;
        for (int i = 0; i < n; i++) {
            count = 5 - i;
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = (2 * (n - i)) - 1; j > 0; j--) {
                if (j > n) {
                    System.out.print(count + " ");
                    count--;
                } else if (j <= n) {
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}
