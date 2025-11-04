public class test2 {
    public static void fibo(int n) {
        int a=0,b=1,c,sum=0;
        System.out.println("Fibonacci Series : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            sum+=a;
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("\nSum = " + sum);
    }

    public static void geo(int n){
        int a=2,r=3;
        int sum=0;
        System.out.println("Geometry Series:");
        for (int i = 1, k = a; i <= n; i++,k*=r ) {
            System.out.print(k + " ");
            sum+=k;
        }
        System.out.println();
        System.out.println("Sum of series: "+sum);
    }

    public static void squarenum(int n){
        int sum = 0;

        System.out.print("Square Numbers: ");
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
            sum += square;
        }
        System.out.println("\nSum = " + sum);
    }

    public static void leap(){
        System.out.print("Leap years from 2000 to 2020: [");
        boolean first = true;

        for (int year = 2000; year <= 2020; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                if (!first) System.out.print(", ");
                System.out.print(year);
                first = false;
            }
        }
        System.out.println("]");
    }

    public static void largestinarr() {
        int[] arr = {5,8,2,9,1,6};
        int largest=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest)
                largest=arr[i];
        }
        System.out.println("Largest Element : "+largest);
    }

    public static void seclargest() {
        int[] arr = {5,11,2,9,1,6};
        int largest=arr[0];
        int seclargest=arr[0];

        //find largest
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest)
                largest=arr[i];
        }

        // find second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest) {
                if (arr[i] > seclargest) {
                    seclargest = arr[i];
                }
            }
        }
        System.out.println("second Largest Element : "+seclargest);
    }

    public static void p1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i-1); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2*(i+1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (n-i-1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void p2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void hollow(int n) {
    // Upper half (excluding center)
    for (int i = 1; i < n; i++) {
        //spaces
        for (int j = i; j <= n; j++) {
            System.out.print(" ");
        }
         //starss
        for (int j = 1; j < i; j++) {
            if (j == 1) System.out.print("*");
            else System.out.print(" ");
        }
         //starss
        for (int j = 1; j <= i; j++) {
            if (j == i) System.out.print("*");
            else System.out.print(" ");
        }

        System.out.println();
    }

    // Lower half
    for (int i = n - 1; i >= 1; i--) {
        //spaces
        for (int j = i; j <= n; j++) {
            System.out.print(" ");
        }
        //starss
        for (int j = 1; j < i; j++) {
            if (j == 1) System.out.print("*");
            else System.out.print(" ");
        }
         //starss
        for (int j = 1; j <= i; j++) {
            if (j == i) System.out.print("*");
            else System.out.print(" ");
        }

        System.out.println();
    }
}
    public static void main(String[] args) {
        int n=5;
        //fibo(n);
        //geo(n);
        //squarenum(n);
        //leap();
        //largestinarr();
        //seclargest();
        //p1(n);
        //p2(n);
        hollow(n);
    }
}
