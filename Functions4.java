//Calculating the facorial

import java.util.Scanner;

public class Functions4 {
    public static void CalculateFactorial(int a){
        //loop
        int factorial = 1;
        for(int i=a;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println("The facctorial of the number is: "+factorial);
        return;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number: ");
        int a = sc.nextInt();
        CalculateFactorial(a);
        }
    }
    
