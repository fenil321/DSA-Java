public class Number_Pyramid {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
