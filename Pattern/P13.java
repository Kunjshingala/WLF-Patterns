import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        for (int i = 0; i < n; i++) {
            count = n;
            for (int j = i; j < n; j++) {
                System.out.print(count - i);
                count--;
            }
            System.out.println();
        }
        sc.close();
        return;
    }
}
