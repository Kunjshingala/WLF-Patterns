// 1-> *********
// 2->  ******* 
// 3->   *****  
// 4->    ***   
// 5->     *    
// 6->    ***   
// 7->   *****  
// 8->  ******* 
// 9-> *********
package Optimized;

public class P52 {
    public static void main(String[] args) {
        int n = 5;
        int row;
        for (int i = 1; i <= 2 * n - 1; i++) {

            System.out.print(i + "->" + " ");

            if (i <= n) {
                row = n - i + 1;
            } else {
                row = i - n + 1;
            }
            for (int j = 1; j <= n + row - 1; j++) {
                if (j + row < n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

// package Optimized;

// public class P52 {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= 2 * n - 1; i++) {

// System.out.print(i + "->" + " ");

// for (int j = 1; j <= 2 * n - 1; j++) {

// if (i <= n) {

// if (j >= i && j <= (2 * n) - i) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }

// } else {

// if (j >= ((2 * n)) - i && j <= i) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// }
// System.out.println();
// }
// }
// }