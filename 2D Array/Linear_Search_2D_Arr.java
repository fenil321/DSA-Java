import java.util.Scanner;

public class Linear_Search_2D_Arr {
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
        //find x
        System.out.println("Enter X value:");
        int x = sc.nextInt();

        //output
        System.out.println("The "+rows+" X "+cols+" Matrix :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(numbers[i][j] == x){
                    System.out.print("X found at location ("+i+","+j+")");
                }
            }
            System.out.println();
        }
    }

}
