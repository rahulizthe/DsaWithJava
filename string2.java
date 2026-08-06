//String concatenation

import java.util.Scanner;

public class string2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first name: ");
        String firstname = sc.next();
        System.out.print("enter last name: ");
        String lastname = sc.next();
        //String adding 
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);



    }
}
