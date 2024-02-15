// 54321
// 4321
// 321
// 21
// 1
public class P13 {
    public static void main(String[] args) {
        int n = 5;
        int count = n;
        for (int i = n; i >= 1; i--) {
            count = i;
            for (int j = 1; j <=i; j++) {
                System.out.print(count);
                count--;
            }
            System.out.println();
        }
    }
}
