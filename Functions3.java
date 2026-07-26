import java.util.Scanner;

public class Functions3 {
    // calculating the product of two numbers.
    public static int CalculatingProduct(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number1: ");
        int a = sc.nextInt();
        System.out.print("Enter number2: ");
        int b =sc.nextInt();
        int product = CalculatingProduct(a, b);
        System.out.println("The product of two number is: "+product);
    }
}
