public class P54 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || i == n + 1 || j == 0 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
