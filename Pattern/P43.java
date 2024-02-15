// 9
// 01
// 234
// 5678
// 90123
public class P43 {
    public static void main(String[] args) {
        int n = 5;
        int count = 9;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                if (count == 9) {
                    count = 0;
                } else {
                    count++;
                }
            }
            System.out.println();
        }

    }
}