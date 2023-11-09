public class P30 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j<n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
