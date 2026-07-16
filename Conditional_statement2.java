import java.util.*;

public class Conditional_statement2 {
    public static void main(String args[]){
        Scanner cs2 = new Scanner(System.in);
        System.out.print("Enter you number: ");
        int number = cs2.nextInt();
        if(number%2==0){
            System.out.println(number+" is an even number.");
        }else{
            System.out.println(number+" is an odd number.");
        }


    }
}
