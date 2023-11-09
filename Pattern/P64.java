public class P64 {
    public static void main(String[] args) {
        int n = 4;
        int count;
        for (int i = 0; i < n; i++) {
            count = i;
            for (int j = 0; j < ((2 * i) + 1); j++) {
                if (j <= i)
                    count++;
                else
                    count--;

                System.out.print(count);
            }
            System.out.println();
        }
    }
}
