// **********
// ****__****
// ***____***
// **______**
// *________*
public class P56 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=2*n; j++) {
                if (j<=n) {
                    if (i+j>n+1) {
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else if (j>n) {
                    if (j-i<n) {
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }                
            }
            System.out.println();
        }
    }
}
