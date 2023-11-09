public class P92 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;

        for (int i = 0; i < n; i++) {
            count = n - i;
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(count + " ");
                if (j < i) {
                    count++;
                } else if (j >= i) {
                    count--;
                }
            }
            System.out.println();
        }
    }
}
