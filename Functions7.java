import java.util.Scanner;
//Printing the fibonnaci series using functions.
public class Functions7 {

    public static void PrintingFibonacci(int n) {

        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms: ");
        int n = sc.nextInt();
        PrintingFibonacci(n);
        sc.close();
    }
}