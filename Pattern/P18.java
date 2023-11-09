import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;

        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = (2 * (n - i)) - 1; j > 0; j--) {
                if (j > n - i) {
                    System.out.print(count+" ");
                    count++;
                } else {
                    System.out.print(count+" ");
                    count--;
                }
            }

            System.out.println();
        }
        sc.close();
        return;
    }
}
