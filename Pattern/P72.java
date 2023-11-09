public class P72 {
    public static void main(String[] args) {
        int n = 5;
        int x = 9;
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(count);
                if (count >= x) {
                    count = 1;
                } else {
                    count++;
                }
            }
            System.out.println();
        }
    }
}
