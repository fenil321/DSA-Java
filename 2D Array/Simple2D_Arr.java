import java.util.*;
public class Simple2D_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int rows = sc.nextInt();
        System.out.println("Enter Columns:");
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        //input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        //output
        System.out.println(rows+" X "+cols+" Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }
}
