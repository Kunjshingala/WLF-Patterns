public class P49 {
    public static void main(String[] args) {
        int n = 4;
        int max = 2 * n + 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print(max - Math.abs(j - i));
            }
            
            System.out.println();
        }

    }
}
