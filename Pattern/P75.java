// 1      a
// 21     ba
// 321    cba
// 4321   dcba
// 54321  edcba
public class P75 {
    public static void main(String[] args) {
        int n = 5;
        int count1, count2;

        // char ch = (char) (65 + n - 1);

        for (int i = 1; i <= n; i++) {
            count1 = count2 = i;
            for (int j = 1; j <= n + i + 1; j++) {
                if (j <= n) {
                    if (j <= i) {
                        System.out.print(count1);
                        count1--;
                    } else {
                        System.out.print(" ");
                    }
                } else if (j == n + 1) {
                    System.out.print(" ");
                } else {
                    if (j - i <= n + 1) {
                        System.out.print((char)(65+count2-1));
                        count2--;
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}