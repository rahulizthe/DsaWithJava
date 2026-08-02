import java.util.Scanner;

public class Array2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        
        int number[] = new int[size];
        //input 
        for(int i=0;i<size;i++){
            System.out.print("enter the value of index" + i + ":");
            number[i] = sc.nextInt();
            
        }
        //Here Java automatically print the null value if there is no value initiated.
        //output
        for(int i=0;i<size;i++){
            System.out.println(number[i]);
        }
        
    }
}