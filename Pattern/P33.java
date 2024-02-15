//      1 
//     1 2 
//    1 2 3 
//   1 2 3 4 
//  1 2 3 4 5 

public class P33 {
    public static void main(String[] args) {
        int n = 4;
        int count;
        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= n; j++) {
                if (i + j < n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}
