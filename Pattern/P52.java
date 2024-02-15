// // For Numbers

// // 123454321
// //  2345432 
// //   34543  
// //    454   
// //     5    
// //    454   
// //   34543  
// //  2345432 
// // 123454321

public class P52 {

    public static void main(String[] args) {
        int n = 5;
        int row;
        for (int i = 1; i <= 2 * n - 1; i++) {

            int count = 1;

            if (i <= n) {
                row = n - i + 1;
            } else {
                row = i - n + 1;
            }
            for (int j = 1; j <= n + row - 1; j++) {
                if (j + row < n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print((char) (65 + count - 1));
                    if (j < n) {
                        count++;
                    } else if (j >= n) {
                        count--;
                    }
                }
            }
            System.out.println();
        }
    }
}

// //For Star

// *********
// *******
// *****
// ***
// *
// ***
// *****
// *******
// *********
// public class P52 {

// public static void main(String[] args) {
// int n = 5;
// int row;
// for (int i = 1; i <= 2 * n - 1; i++) {

// if (i <= n) {
// row = n - i + 1;
// } else {
// row = i - n + 1;
// }
// for (int j = 1; j <= n + row - 1; j++) {
// if (j + row < n + 1) {
// System.out.print(" ");
// } else {
// System.out.print("*");
// }
// }
// System.out.println();
// }
// }
// }