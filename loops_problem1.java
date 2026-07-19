import java.util.Scanner;

public class loops_problem1 {
    //printing the sum of n consecutive number in java.
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
