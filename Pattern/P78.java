//  **** 
// *    *
// *    *
//  **** 
public class P78 {
    public static void main(String[] args) {
        int m = 4;
        int n = 6;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && (j == 1 || j == n)) || ((i == m && (j == 1 || j == n)))) {
                    System.out.print(" ");
                } else if (i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
