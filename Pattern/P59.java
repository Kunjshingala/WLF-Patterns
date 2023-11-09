public class P59 {
    public static void main(String[] args) {
        int n = 10;
        char ch='A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(j + 1);
                } else {
                    System.out.print((char)(ch+j));
                }
            }
            System.out.println();
        }
    }
}
