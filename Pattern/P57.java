public class P57 {
    public static void main(String[] args) {
        int n = 3;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (i * (i + 1)) / 2; j++) {
                System.out.print(count + " ");
                count = count + 2;
            }
            System.out.println();
        }
    }
}
