// * * * * * * * 
// * * * * * 
// * * * 
// * 
public class P67 {
    public static void main(String[] args) {
        int fre = 7;

        int n = (fre / 2) + 1;
        System.out.println(n);

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// public class P67 {
// public static void main(String[] args) {
// int n = 9;
// for (int i = (n / 2) + 1; i > 0; i--) {
// for (int j = (2 * i) - 1; j > 0; j--) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }
