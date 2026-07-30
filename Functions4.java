//Calculating the facorial

import java.util.Scanner;

public class Functions4 {
    public static void CalculateFactorial(int a){
        //checking for invalid numbers
        if(a<0){
            System.out.println("Invalid Number");
            return;
        }
        //loop
        int factorial = 1;
        for(int i1=a;i1>=1;i1--){
            factorial = factorial*i1;
        }
        System.out.println("The factorial of the number is: "+factorial);
        return;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number: ");
        int a = sc.nextInt();
        CalculateFactorial(a);
        }
    }
    
