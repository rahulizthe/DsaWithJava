import java.util.Scanner;
//Calculating the average of 3 numbers.
public class Functions6 {
    public static void CalculatingCircumference(int r,float pi){
        float circumference = 2*pi*r;
        System.out.println("The Circumference of the Circle is: "+circumference);
        return;
    }
    public static void main(String args[]){
        //Taking input of three numbers.
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int r= sc.nextInt();
        System.out.print("Enter second number: ");
        float pi = (float) 3.14;
        //calling the function.
        CalculatingCircumference(r,pi);
    }
    
}
