// //0      *
// //1     ***
// //2    *****
// //3   *******
// //4    *****
// //5     ***
// //6      *

package Optimized;

public class P34 {

    public static void main(String[] args) {
        int n = 5;
        int row;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                row = i;
            } else {
                row = 2 * n - i;
            }
            for (int j = 1; j <= n + row - 1; j++) {
                if (i <= n) {
                    if (row + j < n + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }else{
                     if (row + j < n + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}