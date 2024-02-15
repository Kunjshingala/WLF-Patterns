// @
// #
// @@
// ##
// @@@
// ###
public class P97 {
    public static void main(String[] args) {
        int n = 3;
        int count = 1;
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < count; j++) {
                if (i % 2 == 0) {
                    System.out.print("@");
                } else {
                    System.out.print("#");
                }
            }
            if (i % 2 != 0) {
                count++;
            }
            System.out.println();
        }
    }
}