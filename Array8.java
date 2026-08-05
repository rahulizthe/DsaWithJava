import java.util.Scanner;

public class Array8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("enter number of columns: ");
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element you want to search: ");
        int x = sc.nextInt();
        //outerloop
        for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
               //compare with x
               if(numbers[i][j] == x) {
                   System.out.println("x found at location (" + i + ", " + j + ")");
               }
           }
       }

    }
    
}
