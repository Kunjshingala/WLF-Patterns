import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        for (int i = 0; i < n; i++) {
            count = i + 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(count);
                count--;
            }
            System.out.println();
        }
        sc.close();
        return;
    }
}
