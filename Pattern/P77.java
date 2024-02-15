// 1
// 01
// 101
// 0101
// 10101
public class P77 {
    public static void main(String[] args) {
        int n = 5;
        int count;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                count = 1;
            } else {
                count = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(count);
                if (count == 1) {
                    count = 0;
                } else {
                    count = 1;
                }
            }
            System.out.println();
        }
    }
}
