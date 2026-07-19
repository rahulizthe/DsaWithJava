import java.util.Scanner;

public class loops_problem2 {
    //printing the table in java input by the user.
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        System.out.println("here is your table");
        for(int i = 1;i<11;i++){
            System.out.println(n*i);
        }
    }
}
