// 1234
// 341
// 12
// 3
public class P70 {
    public static void main(String[] args) {
        int n = 4;
        int count;

        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                count = 1;
            } else {
                count = 3;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                if (count == 4) {
                    count = 1;
                } else {
                    count++;
                }
            }
            System.out.println();
        }
    }
}