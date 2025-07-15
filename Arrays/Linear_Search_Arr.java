import java.util.Scanner;

public class Linear_Search_Arr {
    public static void main(String[] args) {
        int numbers[] = new int[20]; 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        //input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Number for Arrays: ");
            numbers[i] = sc.nextInt();
        }

        //find x in arrays
        System.out.print("Enter Element X: ");
        int x = sc.nextInt();
    
        //output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("The X found at location : "+i);
            }
        }
    }
}
