import java.util.Arrays;

public class test {
    public static void PrimeArray(int n){
        int[] primes = new int[n];
        int count = 0;

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[count] = i;
                count++;
            }
        }

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 0; i < count; i++) {
            System.out.print(primes[i] + " ");
        }
    }

    public static void frequencyofnum() {
        int[] arr = {1,1, 2, 2, 3, 4, 4, 4};
        boolean[] visited = new boolean[arr.length];

        //condition for already visited element
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + ":" + count);
        }
    }

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) System.out.print("*");
            } else {
                for (int j = 1; j <= i; j++) System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void evenodd() {

        Integer[] arr = {8, 4, 5, 2, 3, 1};

        Arrays.sort(arr, (a, b) -> {
            if (a % 2 == 0 && b % 2 != 0) return -1; // even first
            if (a % 2 != 0 && b % 2 == 0) return 1;  // odd last
            return b - a; // descending order
        });

        System.out.println(Arrays.toString(arr));
    }

    public static void simplevenodd(){
        int[] arr = {8, 4, 5, 2, 3, 1};

        // Sort in descending order first
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Create a new array for result
        int[] result = new int[arr.length];
        int index = 0;

        // Add even numbers first (descending order already)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

        // Then add odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        // Print result
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void reverseword() {
        String str = "programmer java Hello gandu";
        String[] words = str.split(" ");
        
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) System.out.print(" ");
        }
    }

    public static void hollowrec(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0||j==0||i==n-1||j==n-1)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        //PrimeArray(n);
        //frequencyofnum();
        //pattern(n);
        //evenodd();
        //simplevenodd();
        //reverseword();
        hollowrec(n);
    }
}
