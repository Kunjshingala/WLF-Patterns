// ABCDCBA
//  ABCBA 
//   ABA  
//    A
package Optimized;

public class P39 {
    public static void main(String[] args) {
        char ch = 'd';
        char c = Character.toUpperCase(ch);
        int n = c - 65 + 1;
        System.out.println(n);

        int count;

        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j < i || i + j > 2 * n) {
                    System.out.print(" ");
                } else {
                    System.out.print((char) (65 + count - 1));
                    if (j < n) {
                        count++;
                    } else {
                        count--;
                    }
                }
            }
            System.out.println();
        }
    }
}
