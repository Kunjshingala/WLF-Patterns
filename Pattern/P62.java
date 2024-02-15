// A
// BA
// ABA
// BABA
// ABABA
public class P62 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            int count;
            if (i % 2 != 0) {
                count = 1;
            } else {
                count = 2;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (65 + count - 1));
                if (count == 1) {
                    count = 2;
                } else {
                    count = 1;
                }
            }
            System.out.println();
        }
    }
}
