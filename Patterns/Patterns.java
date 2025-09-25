public class Patterns {
    public static void p1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0 || i==n-1 || j==n-1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void p2(int n){
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 0; j < (n-i-1); j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j < 2*(i+1); j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 0; j < (n-i-1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void p3(int n) {
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            ///stars
            for (int j = 0; j < 2*n-(2*i+1); j++) {
                System.out.print("*");
            }
             //spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void fibo(int n){
        int a=0,b=1;
        System.out.print(a+" "+b);
        int c;
        for (int i = 1; i <= n; i++) {
            c=a+b;
            System.out.print(" " +c);
            a=b;
            b=c;
        }
    }

    public static void prime(int n){
        int temp=0;
        for (int i = 2; i <= n-1; i++) {
            if (n%i==0) {
                temp=temp+1;
            }
        }
        if (temp==0) {
            System.out.println("Its a prime Number");
        }else{
            System.out.println("Its not a prime Number");
        }
    }

    public static void leap(int year){
        if((year%400==0) || (year%4==0) && (year%100 != 0))
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }

    public static void geom(int n, int a, int r) {
        int sum=0;
        System.out.println("Geometry Series:");
        for (int i = 1, k = a; i <= n; i++,k*=r ) {
            System.out.print(k + " ");
            sum+=k;
        }
        System.out.println();
        System.out.println("Sum of series: "+sum);
    }

    public static void table(int n) {
        System.out.println("Multiplication Table");
        for (int i = 1; i <= n; i++) {
            System.out.println(n + " X "+ i + " = "+(n*i));
        }
    }

    /* public static void hollow(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < i; j++) {
                if (j==1 || i==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <=i; j++) {
                if (j==i || i == n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } */
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
        int n=5,a=2,r=3;
        int year=2036;
       // p2(n);
       // p3(n);
       //fibo(n);
       //prime(n);
       //leap(year);
       //geom(n, a, r);
       // table(n);
       hollow(n);
    }
}
