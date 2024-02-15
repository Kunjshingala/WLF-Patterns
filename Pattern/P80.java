// 1
// *2
// 1*3
// *2*4
// 1*3*5
public class P80 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print(j);
                    } else {
                        System.out.print("*");
                    }
                } else if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print(j);
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}

// public class P80 {
// public static void main(String[] args) {
// int n = 6;
// for (int i = 1; i < n; i++) {
// if (i % 2 != 0) {
// for (int j = 1; j <= i; j++) {
// if (j % 2 != 0) {
// System.out.print(j);
// } else {
// System.out.print("*");
// }
// }
// } else {
// for (int j = 1; j <= i; j++) {
// if (j%2==0) {
// System.out.print(j);
// }else{
// System.out.print("*");
// }
// }
// }
// System.out.println();
// }
// }
// }
