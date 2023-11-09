public class P98 {
    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print((j + 1) * (j + 1) + " ");
            }
            System.out.println();
        }
    }
}
