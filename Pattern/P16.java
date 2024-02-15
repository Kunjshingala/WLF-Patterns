// 12345
//  1234
//   123
//    12
//     1
public class P16 {
    public static void main(String[] args) {

        int n = 5;
        int count;

        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= n; j++) {
                if (j < i) {
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