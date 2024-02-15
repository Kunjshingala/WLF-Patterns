// 123454321
//  1234321
//   12321
//    121
//     1
public class P18 {
    public static void main(String[] args) {

        int n = 5;
        int count;

        for (int i = 5; i >= 1; i--) {
            count = 1;
            for (int j = 1; j <= i + n - 1; j++) {
                if (i + j < n + 1) {
                    System.out.print(" ");
                }else{
                    System.out.print(count);
                    if (j<n) {
                        count++;
                    }else{
                        count--;
                    }
                }
            }
            System.out.println();
        }
    }
}
