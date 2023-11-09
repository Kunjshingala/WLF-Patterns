import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = n; j > i; j--) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        sc.close();
        return;
    }
}
