import java.util.Scanner;
//Calculating the average of 3 numbers.
public class Functions5 {
    public static void Calculatingaverage(int a,int b,int c){
        int average = (a+b+c)/3;
        System.out.println("The Average of the number is: "+average);
        return;
    }
    public static void main(String args[]){
        //Taking input of three numbers.
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("enter third number: ");
        int c = sc.nextInt();
        //calling the function.
        Calculatingaverage(a, b, c);
    }
    
}
