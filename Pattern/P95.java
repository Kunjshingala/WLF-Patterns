public class P95 {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "   ");
                 num = num + count;
            }
            count = n;
            System.out.println();
        }
    }
}
