public class Solid_Rhombus {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
