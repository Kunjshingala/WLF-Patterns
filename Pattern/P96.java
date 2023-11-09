public class P96 {
    public static void main(String[] args) {
        int n = 3;
        int count = 1;
        char ch = 65;

        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < count; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (ch + count - 1));
                } else {
                    System.out.print(count);
                }
            }
            if (i % 2 != 0) {
                count++;
            }
            System.out.println();
        }
    }
}
