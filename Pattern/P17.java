//      1
//     121
//    12321
//   1234321
//  123454321
public class P17 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= n + i - 1; j++) {
                if (i + j < n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(count);
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