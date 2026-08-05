import java.util.Scanner;

public class Array7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("enter number of columns: ");
        int cols = sc.nextInt();
        
        int numbers[][] = new int[rows][cols];

        //input
        //outer loop for rows
        for(int i=0;i<rows;i++){
            //inner loop for columns
            for(int j=0;j<cols;j++){
                System.out.print("enter the number for row " + (i+1) + " and column " + (j+1) + ": ");
                numbers[i][j] = sc.nextInt();
            }

        }
        //output
        System.out.println("here are the number in the 2D array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
