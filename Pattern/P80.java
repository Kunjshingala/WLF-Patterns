public class P80 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0) {
                        System.out.print(j);
                    } else {
                        System.out.print("*");
                    }
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    if (j%2==0) {
                        System.out.print(j);
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
