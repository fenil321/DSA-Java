import java.util.*;

public class Simple_Arr {
    public static void main(String[] args) {
        int numbers[] = new int[5]; // first way to initialize
        //int [] marks = new int[5]; // Second way to initialize

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        //input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Number for Arrays: ");
            numbers[i] = sc.nextInt();
        }

        //output
        System.out.println("The Arrays: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}