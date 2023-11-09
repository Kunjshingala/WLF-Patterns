public class P47 {
    public class P46 {
        public static void main(String[] args) {

            char ch = 'f';
            char c = Character.toUpperCase(ch);
            int n = c - 65 + 1;
            System.out.println(n);
            System.out.println(c);

            for (int i = 0; i < n; i++) {
                int count = 1;
                for (int j = 0; j < 2 * (n - i); j++) {

                    if (j == (n - i - 1)) {
                        System.out.print((char) (c - (n - count)) + " ");
                    } else if (j < (n - i - 1)) {
                        System.out.print((char) (c - (n - count)) + " ");
                        count++;

                    } else {
                        System.out.print((char) (c - (n - count)) + " ");
                        count--;
                    }

                }
                System.out.println();
            }
        }
    }

}
