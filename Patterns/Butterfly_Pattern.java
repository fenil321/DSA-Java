public class Butterfly_Pattern {
    public static void main(String[] args) {
        int n = 4;
        //upper half
        for (int i = 1; i <= n; i++) {
            //1st part star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            //2nd part star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i = n; i >= 1; i--) {
            //1st part star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            //2nd part star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
