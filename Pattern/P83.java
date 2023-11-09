import java.util.Scanner;

public class P83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + "th Element : ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(a[j]);
            }
            System.out.println();
        }
    }
}
