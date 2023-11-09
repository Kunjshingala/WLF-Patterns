public class P66 {
    public static void main(String[] args) {

        char ch = 'c';
        char c = Character.toUpperCase(ch);
        int x = c - 65;

        int n = 2 * x + 1;
        
        for (int i = 1; i <= n; i++) {
            int num = 0;

            for (int j = 1; j <= n; j++) {

                if (j <= 3) {
                    num++;
                } else {
                    num--;
                }

                if (i == 3) {
                    if (j >= 2 && j <= 4) {
                        System.out.print(" ");
                    } else {
                        System.out.print((char) (65 - (x - num - 1)));
                    }

                } else if (i == 2 || i == 4) {

                    if (j == 3) {

                        System.out.print(" ");
                    } else {

                        System.out.print((char) (65 - (x - num - 1)));
                    }
                } else {

                    System.out.print((char) (65 - (x - num - 1)));
                }
            }
            System.out.println();
        }

    }
}
