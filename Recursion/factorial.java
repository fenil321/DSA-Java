public class factorial {
    public static int calfact(int n){
        if (n == 1 || n == 0) { //base case
            return 1;
        }
        int fact_num = calfact(n - 1);
        int fact_n = n * fact_num;
        return fact_n;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = calfact(n);
        System.out.println(ans);
    }
}
