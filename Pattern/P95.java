// 1 
// 2 7 
// 3 8 13 
// 4 9 14 19 
// 5 10 15 20 25
public class P95 {
    public static void main(String[] args) {
        int n = 5;
        int count;
        for (int i = 1; i <= n; i++) {
            count = i;

            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count = count + 5;
            }
            System.out.println();
        }
    }
}

// public class P95 {
// public static void main(String[] args) {
// int n = 5;
// int count = 0;

// for (int i = 1; i <= n; i++) {
// int num = i;
// for (int j = 1; j <= i; j++) {
// System.out.print(num + " ");
// num = num + count;
// }
// count = n;
// System.out.println();
// }
// }
// }
