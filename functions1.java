import java.util.Scanner;

public class functions1 {
    //makig a function named as PrintMyName
    public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        //calling the function here.
        PrintMyName("Hello "+name);

    }
}
