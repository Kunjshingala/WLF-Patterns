public class P93 {
    public static void main(String[] args) {

        int count = 9;
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count+ "  ");

                if (i == 0) {
                    count--;
                } else if (i < 3 && j == i) {
                    count = count + 1;
                } else if (i >= 3 && i == j) {
                    count = count + 3;
                } else {
                    count = count - 2;
                }
            }

            System.out.println();
        }
    }
}