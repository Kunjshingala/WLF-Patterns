// // 1234
// // 341
// // 12
// // 3
public class P71 {
    public static void main(String[] args) {
        char ch = 'D';
        char c = Character.toUpperCase(ch);
        int n = c - 65 + 1;
        int count;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                count = 1;
                for (int j = 0; j < n - i; j++) {
                    if (count > n) {
                        count = n - 1;
                        System.out.print((char) (65 + (count - 1)));
                        count++;
                    } else {
                        System.out.print((char) (65 + (count - 1)));
                        count++;
                    }
                }
            } else {
                count = n - 1;
                for (int j = 0; j < n - i; j++) {
                    if (count > n) {
                        count = 1;
                        System.out.print((char) (65 + (count - 1)));
                        count++;
                    } else {
                        System.out.print((char) (65 + (count - 1)));
                        count++;
                    }
                }
            }
            System.out.println();
        }
    }
}