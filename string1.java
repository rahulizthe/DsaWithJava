import java.util.Scanner;

public class string1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Taking input
        System.out.print("enter your name: ");
        String name = sc.next();
        System.out.print("enter your age: ");
        String age = sc.next();
        System.out.print("enter your roll number: ");
        String rollno = sc.next();
        //Printing the string.
        System.out.println("your name is: " + name + "\nand roll number is " + rollno);
        System.out.println("according to us your age is "+ age +" if you are born in "+ (2027-Integer.parseInt(age)));

    }
    
}
