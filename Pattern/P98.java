// 1 
// 1 4 9 
// 1 4 9 16 25 
// 1 4 9 16 25 36 49 
// 1 4 9 16 25 36 49 64 81

public class P98 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j * j + " ");
            }
            System.out.println();
        }
    }
}