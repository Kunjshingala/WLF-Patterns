// + 0 0 0 0 0 0 
// 0 + 0 0 0 0 0 
// 0 0 + 0 0 0 0 
// 0 0 0 + 0 0 0 
// 0 0 0 0 + 0 0 
// 0 0 0 0 0 + 0 
// 0 0 0 0 0 0 +
public class P88 {

    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("+ ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
