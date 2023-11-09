public class P26 {
    public static void main(String[] args) {
        String str = "INDIA";
        
        for (int i = 0; i < 2 * str.length(); i++) {
            if (i < str.length()) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(str.charAt(j));
                }
            } else if (i >= str.length()) {
                for (int j = i; j < 2 * (str.length()); j++) {
                    System.out.print(str.charAt(j-i));
                }
            }
            System.out.println();
        }
    }
}
