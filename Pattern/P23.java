public class P23 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) + 1; j++) {
                if (j < i) {
                    System.out.print(ch);
                    ch++;
                } else {
                    System.out.print(ch);
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
