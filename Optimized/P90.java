// +++++++*+++++++
// ++++++*+*++++++
// +++++*+++*+++++
// ++++*+++++*++++
// +++*+++++++*+++
// ++*+++++++++*++
// +*+++++++++++*+
// *+++++++++++++*
package Optimized;

public class P90 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n + 1; i++) {
            for (int j = 1; j <= 2 * n + 1; j++) {
                if ((i + j == n + 2) || ((j - i == n) && (j >= n + 1))) {
                    System.out.print("*");
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}
        