// // 1234
// // 341
// // 12
// // 3
public class P70 {
    public static void main(String[] args) {
        int n = 4;
        int count;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                count = 1;
                for (int j = 0; j < n - i; j++) {
                    if (count > n) {
                        count = n - 1;
                        System.out.print(count + "  ");
                        count++;
                    } else {
                        System.out.print(count + "  ");
                        count++;
                    }
                }
            } else {
                count = n - 1;
                for (int j = 0; j < n - i; j++) {
                    if (count > n) {
                        count = 1;
                        System.out.print(count + "  ");
                        count++;
                    } else {
                        System.out.print(count + "  ");
                        count++;
                    }
                }
            }
            System.out.println();
        }
    }
}