import java.util.*;
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
    public static boolean sumGame(String num) {
        int n = num.length();
        int sumL=0, sumR=0;
        int lQ=0, rQ=0;

        //Left side
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?'){
                lQ++;
            }else{
                sumL+=num.charAt(i)-'0';
            }
        }

        //right side
        for(int i=n/2; i<n;i++){
            if(num.charAt(i)=='?'){
                rQ++;
            }else{
                sumR+=num.charAt(i)-'0';
            }
        }

        // if total num of '?' is odd, alice always gets last move and win
        if((lQ+rQ)%2!=0){
            return true;
        }

        return (sumL-sumR)*2 != (rQ-lQ)*9;
    }

    public static int missingMultiple(int[] nums, int k) {
       Set<Integer> set = new HashSet<>();
       for(int num:nums){
        set.add(num);
       }

       int multiple=k;
       while(set.contains(multiple)){
        multiple+=k;
       }

       return multiple;
    }

    public static void main(String[] args) {
        System.out.println(checkDivisibility(99)); // Example usage
        System.out.println(smallestNumber(123, 5)); // Example usage
        System.out.println(sumGame("5?456???"));
        System.out.println(missingMultiple(new int[]{8,2,3,4,6}, 2));
    }
}
