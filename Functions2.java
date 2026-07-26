import java.util.Scanner;

public class Functions2 {
    //makig a function named as CalculateSum
    public static int CalculateSum(int num1,int num2){
        int sum =num1+num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.print("enter the num2: ");
        int num2= sc.nextInt();
        //calling the function here.
        int sum =CalculateSum(num1,num2);
        System.out.println("the sum of numbers are: "+sum);
    
        

    }
}
