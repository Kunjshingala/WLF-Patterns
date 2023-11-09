// public class P21 {
//     public static void main(String[] args) {
//         int n = 6;

//         for (int i = 0; i < n; i++) {
//             int count = 1;
//             for (int j = n - i; j > 0; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j < i + 1; j++) {
//                 if (j == 0 || j == i) {
//                     System.out.print(count + " ");
//                 } else {
//                     if (j % 2 == 0) {
//                         count++;
//                         System.out.print(count + " ");
//                     } else {
//                         count--;
//                         System.out.print(count + " ");
//                     }
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

public class P21 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.print(" ");
            }
            int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = k * (i - j) / j;
            }
            System.out.println();
        }
    }
}