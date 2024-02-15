// 1 
// 3 5 7 
// 9 11 13 15 17 19
public class P57 {
    public static void main(String[] args) {
        int n = 3;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (i * (i + 1)) / 2; j++) {
                System.out.print(count + " ");
                count = count + 2;
            }
            System.out.println();
        }
    }
}
