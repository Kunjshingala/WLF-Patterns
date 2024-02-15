// 5
// 45
// 345
// 2345
// 12345
public class P50 {
    public static void main(String[] args) {
        int n = 5;
        int count;

        for (int i = 1; i <= n; i++) {
            count = n - i + 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}