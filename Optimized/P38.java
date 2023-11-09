package Optimized;

public class P38 {
    public static void main(String[] args) {
        char ch = 'd';
        char c = Character.toUpperCase(ch);
        int n = c - 65 + 1;
        System.out.println(n);
        int count;

        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= n + i - 1; j++) {
                if (i + j < 5) {
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

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n + i; j++) {

// if (j < n - i - 1) {
// System.out.print(" ");
// } else {

// if (j < n) {
// System.out.print((char) (c - ((n - i - 2) + n - j)));
// } else {
// System.out.print((char) (c - (j - i)));
// }
// }
// }
// System.out.println();
// }