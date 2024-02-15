// 12321
// 12 21
// 1   1
// 12 21
// 12321

public class P65 {
    public static void main(String[] args) {
        int count;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= n; j++) {
                if ((i == 2 || i == 4) && j == 3) {
                    System.out.print(" ");
                } else if (i == 3 && (j == 2 || j == 3 || j == 4)) {
                    System.out.print(" ");
                } else {
                    System.out.print(count);
                }
                if (j < 3) {
                    count++;
                } else {
                    count--;
                }
            }
            System.out.println();
        }
    }
}

// public class P65 {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// int num = 0;
// for (int j = 1; j <= n; j++) {
// if (j <= 3) {
// num++;
// } else {
// num--;
// }

// if (i == 3) {
// if (j >= 2 && j <= 4) {
// System.out.print(" ");
// } else {
// System.out.print(num);
// }

// } else if (i == 2 || i == 4) {
// if (j == 3) {
// System.out.print(" ");
// } else {
// System.out.print(num);
// }

// } else {
// System.out.print(num);
// }
// }
// System.out.println();
// }

// }
// }
