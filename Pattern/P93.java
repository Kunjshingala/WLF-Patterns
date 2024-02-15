// 9 
// 8 6 
// 7 5 3 
// 4 2 0 -2 
// 1 -1 -3 -5 -7
public class P93 {
    public static void main(String[] args) {
        int n = 5;
        int count;
        int max = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            count = max;

            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count = count - 2;
            }

            if (i < n - 2) {
                max--;
            } else {
                max = max - 3;
            }

            System.out.println();
        }
    }
}

// public class P93 {
// public static void main(String[] args) {

// int count = 9;
// int n = 5;
// for (int i = 0; i < n; i++) {
// for (int j = 0; j <= i; j++) {
// System.out.print(count+ " ");

// if (i == 0) {
// count--;
// } else if (i < 3 && j == i) {
// count = count + 1;
// } else if (i >= 3 && i == j) {
// count = count + 3;
// } else {
// count = count - 2;
// }
// }

// System.out.println();
// }
// }
// }