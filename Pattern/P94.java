// + 0 0 0 + 0 0 0 + 
// 0 + 0 0 + 0 0 + 0 
// 0 0 + 0 + 0 + 0 0 
// 0 0 0 + + + 0 0 0
public class P94 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n + 1; j++) {
                if ((j == i) || (j == n + 1) || (i + j == 2 * (n + 1))) {
                    System.out.print("+ ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}