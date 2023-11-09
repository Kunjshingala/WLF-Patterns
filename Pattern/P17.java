import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j <= i - 1) {
                    System.out.print(count);
                    count++;
                } else {
                    System.out.print(count);
                    count--;
                }
            }
            System.out.println();
        }
        sc.close();
        return;
    }
}