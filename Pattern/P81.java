// 1
// AB
// 234
// CDEF
// 56789
public class P81 {
    public static void main(String[] args) {
        int n = 5;
        int count1 = 1;
        int count2 = 0;
        

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(count1);
                    count1++;
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print((char) (65 + count2));
                    count2++;
                }
            }
            System.out.println();
        }
    }
}
