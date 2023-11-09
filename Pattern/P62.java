public class P62 {
    public static void main(String[] args) {

        int n = 5;
        char ch = 'A';
        char c = Character.toUpperCase(ch);

        for (int i = 0; i < n; i++) {
            int count;
            for (int j = i; j >= 0; j--) {
                if (j % 2 == 0) {
                    count = 0;
                    System.out.print((char) (c + count));
                } else if (j % 2 != 0) {
                    count = 1;
                    System.out.print((char) (c + count));
                }
            }
            System.out.println();
        }
    }
}
