public class power_of_num {
    public static int calpower(int x, int n){
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
        int xpownum1 = calpower(x, n-1);
        int xpown = x * xpownum1;
        return xpown;
    }
    public static void main(String[] args) {
        int x=2, n=5;
        int ans = calpower(x, n);
        System.out.println(ans);
    }
}
