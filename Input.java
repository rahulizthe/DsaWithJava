import java.util.*;
public class Input {
    public static void main(String args[]){
        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("your name is "+name);
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        System.out.println("your age is: "+age);
        System.out.println("enter your amount: ");
        float amount =sc.nextFloat();
        System.out.println("your amount is: "+amount);
        System.out.println("Hi,"+name+" you are "+age+" old.\nand your amount will be of "+amount+"rupees.\nThankyou "+name);

    }
    
}
