public class leetcodeq {
    public static boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            sum+=digit;
            prod*=digit;
            temp/=10;
        }
        
        int totalsum = sum + prod;

        return n % totalsum == 0;
    }

    public static int smallestNumber(int n, int t) {
        while (true) {
            int prod = 1;
            int temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                prod *= digit;
                temp /= 10;
            }
            if (prod % t == 0) {
                return n;
            }
            n++;
        }
    }
    public static void main(String[] args) {
        System.out.println(checkDivisibility(99)); // Example usage
        System.out.println(smallestNumber(123, 5)); // Example usage
    }
}
