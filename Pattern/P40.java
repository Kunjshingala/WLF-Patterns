public class P40 {
    public static void main(String[] args) {

        char ch = 'e';
        char c = Character.toUpperCase(ch);
        int n = c - 65 + 1;
        System.out.println(n);

        for (int i = 0; i <= 2 * (n - 1); i++) {
            if (i < n) {
                for (int j = i; j < n - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print((char) (c - (n - j - 1)));
                }
            } else {
                for (int j = 0; j <= i - n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j < ((n * 2) - i); j++) {
                    System.out.print((char) (c - (n - j)));
                }
            }
            System.out.println();
        }
    }
}
