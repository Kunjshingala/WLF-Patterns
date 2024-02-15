// 54321
// 5432
// 543
// 54
// 5
public class P58 {
    public static void main(String[] args) {
        int n = 5;
        int count;
        for (int i = n; i >= 1; i--) {
            count = 5;
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count--;
            }
            System.out.println();
        }
    }
}