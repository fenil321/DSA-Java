public class fibonacci {
    public static void printfibo(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfibo(b, c, n - 1);
    }
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printfibo(a, b, n);
    }
}
