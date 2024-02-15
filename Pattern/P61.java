// 1 2 3 4 5 
//  2 3 4 5 
//   3 4 5 
//    4 5 
//     5
public class P61 {
    public static void main(String[] args) {
        int n = 5;
        int count;
        for (int i = n; i >= 1; i--) {
            count = 1;
            for (int j = n; j>=1; j--) {
                if (j>i) {
                    System.out.print(" ");
                }else{
                    System.out.print(count+" ");
                }
                count++;
            }
            System.out.println();
        }
    }
}