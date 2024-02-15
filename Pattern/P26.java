// I
// IN
// IND
// INDI
// INDIA
// INDIA
// INDI
// IND
// IN
// I
public class P26 {
    public static void main(String[] args) {
        String str = "INDIA";
        int row;
        int n = str.length();

        for (int i = 1; i <= 2 * n; i++) {
            if (i <= n) {
                row = i;
            } else {
                row = 2 * n - i + 1;
            }
            for (int j = 1; j <=row; j++) {
                System.out.print(str.charAt(j-1));
            }
            System.out.println();
        }
    }
}
