public class P27 {
    public static void main(String[] args) {
        char ch = 'E';
        Character.toUpperCase(ch);
        int n = ch - 65;

        for (int i = 0; i < (2 * n) + 1; i++) {
            if (i <= n) {
                for (int j = 0; j <= i; j++) {

                    char k = (char) (ch - (n - i));
                    System.out.print(k + " ");

                }
            } else {
                for (int j = (2 * n) - i; j >= 0; j--) {

                    char k = (char) (ch - (i - n));
                    System.out.print(k + " ");

                }
            }
            System.out.println();
        }
    }
}
