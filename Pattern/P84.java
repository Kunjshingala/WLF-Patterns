// 1 
// 2 3 
// 4 
// 5 6 
// 7 
// 8 9 
// 10

public class P84 {
    public static void main(String[] args) {

        int count = 1;

        for (int i = 1; i <= 7; i++) {
            if (i % 2 != 0) {

                System.out.print(count + " ");
                count++;

            } else {
                for (int j = 1; j <= 2; j++) {
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}
