//      1
//     12
//    123
//   1234
//  12345
public class P12 {
    public static void main(String[] args) {
        int n = 5;
        int count;

        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= n; j++) {
                if (i + j < n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(count);
                    count++;
                }
            }
            System.out.println();
        }
    }
}
