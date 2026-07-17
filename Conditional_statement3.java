import java.util.Scanner;

public class Conditional_statement3 {
    public static void main(String args[]){
        Scanner sc3 =new Scanner(System.in);
        System.out.println("enter number a: ");
        int a = sc3.nextInt();
        System.out.println("enter number b: ");
        int b = sc3.nextInt();
        if(a==b){
            System.out.println("a equals to b");
        }else{
            if(a>b){
                System.out.println("a is greater than b");
            }else{
                System.err.println("a is lesser than b");
            }
        }
    }
}
