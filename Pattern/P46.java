// 1234554321
// 12344321
// 123321
// 1221
// 11
public class P46 {
    public static void main(String[] args) {
        int n = 5;
        int count;

        for (int i = n; i >= 1; i--) {
            count = 1;
            for (int j = 1; j <= 2 * i; j++) {
                System.err.print(count);
                if (j < i) {
                    count++;
                } else if (j == i) {
                    continue;
                } else {
                    count--;
                }
            }
            System.out.println();
        }
    }
}