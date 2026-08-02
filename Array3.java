import java.util.Scanner;

public class Array3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array:");
        int size = sc.nextInt();
        int numbers[]= new int[size];

        //input
        for(int i=0;i<size;i++){
            System.out.print("enter the value of index" + i + ":");
            numbers[i] = sc.nextInt();    
        }
        //Searching an element in an array too.
        System.out.print("Enter the element you want to search in an array: ");
        int x = sc.nextInt();

        //output
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == x){
                System.out.println("element found at index " + i);
            }
        }
    }
}
