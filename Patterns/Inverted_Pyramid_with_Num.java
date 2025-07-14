public class Inverted_Pyramid_with_Num {
    public static void main(String[] args) {
        int n = 5;
        //outer loop for Number of rows
        for (int i = n; i >= 1; i--) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        /* for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        } */
    }
}
