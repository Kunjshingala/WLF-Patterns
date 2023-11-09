public class P86 {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < (2 * i) + 1; j++) {
                if (j < i) {
                    System.out.print(count);
                    count++;
                }
                else{
                    System.out.print(count);
                    count--;
                }
            }
            System.out.println();
        }
    }
}
