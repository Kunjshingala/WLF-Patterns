// 1     a    
// 21    ba   
// 321   cba  
// 4321  dcba 
// 54321 edcba
package Optimized;

public class P75 {
    public static void main(String[] args) {
        int n = 5;
        int count1;
        int count2;

        for (int i = 1; i <= 5; i++) {
            count1 = count2 = i;
            for (int j = 1; j <= 2 * n + 1; j++) {

                if (j <= n && j <= i) {
                    System.out.print(count1);
                    count1--;

                } else if (j >= n + 2 && j - i - 1 <= n) {
                    System.out.print((char) (97 + count2 - 1));
                    count2--;

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}