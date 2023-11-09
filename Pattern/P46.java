public class P46 {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < 2 * (n - i); j++) {

                if (j == (n - i - 1)) {
                    System.out.print(count + " ");
                } else if (j < (n - i - 1)) {
                    System.out.print(count + " ");
                    count++;

                } else {
                    System.out.print(count + " ");
                    count--;
                }

            }
            System.out.println();
        }
    }
}
