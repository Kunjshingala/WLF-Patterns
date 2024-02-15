// 54321
//  4321
//   321
//    21
//     1
public class P31 {
    public static void main(String[] args) {
        int n = 5;
        int count;

        for (int i = 1; i <= n; i++) {
            count = 5;
            for (int j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print(count);
                }
                count--;
            }
            System.out.println();
        }
    }
}
