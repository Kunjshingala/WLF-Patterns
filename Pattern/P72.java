// 1
// 23
// 456
// 7891
// 23456
public class P72 {
    public static void main(String[] args) {
        int n = 5;
        int x = 9;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(count);
                if (count >= x) {
                    count = 1;
                } else {
                    count++;
                }
            }
            System.out.println();
        }
    }
}