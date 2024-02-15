package Test;

public class P3 {
    public static void main(String[] args) {
        int n = 5;
        int count;

        for (int i = 1; i <= 5; i++) {
            count = 1;
            for (int j = 1; j <= 5; j++) {
                
                if (i == 3 && j <= 4 && j >= 2) {
                    System.out.print(" ");
                } else if ((i == 2 || i == 4) && (j == 3)) {
                    System.out.print(" ");
                } else {
                    System.out.print(count);
                }
                if (j < 3) {
                    count++;
                } else {
                    count--;
                }
            }
            System.out.println();
        }
    }
}
