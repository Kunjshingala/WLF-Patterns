//     1
//    2 3
//   4 5 6
//  7 8 9 10
public class P60 {
    public static void main(String[] args) {
        int count = 1, n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j < n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(count + " ");
                    count++;
                }
            }
        }
    }
}
