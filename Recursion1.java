public class Recursion1 {
    //Recursion - Where a function call itself again and again until it reaches the Base-Case.
    public static void PrintNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintNum(n-1);
    }
    public static void main(String args[]){
        int n = 5;
        PrintNum(n);
    }
    
}
