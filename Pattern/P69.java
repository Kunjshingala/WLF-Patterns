public class P69 {
    public static void main(String[] args) {
        char ch = 'd';
        char c = Character.toUpperCase(ch);
        int n = (c - 65) + 1;

        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print((char)(c-j));
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char)(c-(n-(j+1))));
            }
            System.out.println();
        }
    }
}
