// *
// ***
// ******
public class P55 {
    public static void main(String[] args) {
        int n=3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (i * (i + 1)) / 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
