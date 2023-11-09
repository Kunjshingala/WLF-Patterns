public class P81 {
    public static void main(String[] args) {
        int n = 5;
        int count1 = 1;
        int count2 = 0;
        char ch = 65;
        System.out.println(ch);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(count1);
                    count1++;
                }
            } else {
                for (int j = 0; j <= i; j++) {
                    System.out.print((char)(ch+count2));
                    count2++;
                }
            }
            System.out.println();
        }
    }
}
