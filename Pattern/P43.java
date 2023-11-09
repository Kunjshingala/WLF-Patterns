public class P43 {
    public static void main(String[] args) {
        int n = 5;
        int count = 9;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count);
                if (count == 9) {
                    count = 0;
                } else {
                    count++;
                }
            }
            System.out.println();
        }

    }
}
