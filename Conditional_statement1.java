import java.util.Scanner;

public class Conditional_statement1 {
    public static void main(String args[]){
        Scanner Cs = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = Cs.nextInt();
        System.out.println("checking if you are adult or not for this club at the age of "+age+"....................");
        //if-else statement 
        if(age>=18){
            System.out.println("\nCongrats!\nyou are an adult.");
        }else{
            System.out.println("\nSorry!\nyou are not an adult.");
        }


    }
    
}
