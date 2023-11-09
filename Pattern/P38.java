public class P38 {
    public static void main(String[] args) {
        char ch = 'D';
        char c = Character.toUpperCase(ch);
        int n = c - 65 + 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + j));
            }
            for (int j = i; j > 0; j--) {
                System.out.print((char) (65 + j - 1));
            }
            System.out.println();
        }
    }
}
