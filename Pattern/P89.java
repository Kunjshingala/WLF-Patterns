public class P89 {
    public static void main(String[] args) {
        int x = 1;
        int n = 5;

        int count1 = 1;

        for (int i = 0; i < n; i++) {
            int count2 = x;
            for (int j = 0; j < count1; j++) {
                System.out.print(count2 + " ");
                count2++;
            }
            count1 = count1 * 2;
            x = 2 * x;
            System.out.println();
        }
    }
}
