// EDCBA
// DCBA
// CBA
// BA
// A
public class P42 {
    public static void main(String[] args) {
        char ch = 'e';
        char c = Character.toUpperCase(ch);
        int n = c - 65 + 1;
        int count;

        for (int i = n; i >= 1; i--) {
            count = i;

            for (int j = 1; j <= i; j++) {
                System.out.print((char) (65 + count - 1));
                count--;
            }
            System.out.println();
        }
    }
}
