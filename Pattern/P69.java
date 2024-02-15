// ABCD
// BCDA
// CDAB
// DABC
public class P69 {
    public static void main(String[] args) {
        char ch = 'd';
        char c = Character.toUpperCase(ch);
        int n = (c - 65) + 1;

        int count;
        for (int i = 1; i <= n; i++) {
            count = i;
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (65 + count - 1));
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
