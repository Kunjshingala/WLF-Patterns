//         1 
//       1 2 3 
//     1 2 3 4 5 
//   1 2 3 4 5 6 7 
public class P45 {
    public static void main(String[] args) {
        int n = 5;
        int count;
        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= i + n - 1; j++) {
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
