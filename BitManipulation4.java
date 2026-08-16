import java.util.Scanner;

public class BitManipulation4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your operational bit: ");
        int oper = sc.nextInt();
        System.out.print("enter your n: ");
        int n = sc.nextInt();
        System.out.print("enter position: ");
        int pos = sc.nextInt();
        int Bitmask = 1<<pos;
        //Set Operation
        if(oper==1){
            int New_Number = Bitmask | n;
            System.out.println("your number is: "+New_Number);
        }else{
            int new_BitMask = ~(Bitmask);
            int New_Number = new_BitMask & n;
            System.out.println("your number is: "+New_Number);
        }
    }
}
