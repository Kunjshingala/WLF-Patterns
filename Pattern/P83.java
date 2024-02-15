// Enter the numbers : 4

// Enter the 0th Element : 1
// Enter the 1th Element : 2
// Enter the 2th Element : 4
// Enter the 3th Element : 6

// 1246
// 246
// 46
// 6

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

        int count;
        for (int i = 1; i <= n; i++) {
            count = i;
            for (int j = i; j <= n; j++) {
                System.out.print(a[count - 1]);
                count++;
            }
            System.out.println();
        }

        sc.close();
    }
}
