public class P84 {
    public static void main(String[] args) {

        int count = 1;

        for (int i = 1; i <= 7; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < 1; j++) {
                    System.out.print(count + " ");
                    count++;
                }
            } else {
                for (int j = 0; j < 2; j++) {
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}
