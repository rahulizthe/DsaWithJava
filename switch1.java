import java.util.Scanner;

public class switch1 {
    public static void main(String args[]){
        Scanner sw = new Scanner(System.in);
        int button = sw.nextInt();
        System.out.println("enter the number: ");
        switch(button){
            case 1: System.out.println("hello");
            break;
            case 2:System.out.println("namaste");
            break;
            case 3:System.out.println("bonjour");
            break;
        }
    }
    
}
