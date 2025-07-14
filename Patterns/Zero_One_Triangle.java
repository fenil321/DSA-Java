public class Zero_One_Triangle {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {

                int sum = i+j;
                if(sum % 2 == 0){ //for even 
                    System.out.print("1"+" ");
                }
                else{ //for odd
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
