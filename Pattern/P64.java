// 1
// 232
// 34543
// 4567654
public class P64 {
    public static void main(String[] args) {
        int n = 4;
        int count;
        for (int i = 1; i <= n; i++) {
            count = i;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(count);
                if (j < i)
                    count++;
                else
                    count--;
            }
            System.out.println();
        }
    }
}