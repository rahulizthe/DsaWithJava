import java.util.Scanner;

public class Conditional_statement4 {
    public static void main(String args[]){
        Scanner sc4 = new Scanner(System.in);
        System.out.println("enter your number: ");
        int number = sc4.nextInt();
        if(number == 1){
            System.out.println("hello");
        }else if(number ==2){
            System.out.println("namaste.");
        }else if(number ==3){
            System.out.println("bonjour");
        }else{
            System.err.println("error found");
        }
    }
}

