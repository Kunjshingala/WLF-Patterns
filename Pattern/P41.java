public class P41 {
    public static void main(String[] args) {
        char ch = 'e';
        char c = Character.toUpperCase(ch);
        int n = c - 65 + 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print((char) (65 + j ));
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {            
            for (int j = n - i ; j > 0; j--) {
                System.out.print((char) (65 + j - 1));
            }
            System.out.println();
        }
    }
}
