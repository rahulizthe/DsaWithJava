import java.util.Scanner;

public class Functions8 {

    public static int CalculatingHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a = sc.nextInt();

        System.out.print("Enter number b: ");
        int b = sc.nextInt();

        System.out.println("HCF = " + CalculatingHCF(a, b));

        sc.close();
    }
}