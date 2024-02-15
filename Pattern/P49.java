// 9
// 898
// 78987
// 6789876
public class P49 {
    public static void main(String[] args) {
        int n = 4;
        int max = 9;
        int count;

        for (int i = 1; i <= n; i++) {
            count = max;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(count);
                if (j < i) {
                    count++;
                } else {
                    count--;
                }
            }
            max--;
            System.out.println();
        }

    }
}